package com.android.project.abcappen.activities;

import android.app.Dialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.project.abcappen.data.ProfileContract;
import com.android.project.abcappen.data.ProfileDatabaseHelper;
import com.android.project.abcappen.services.BackgroundMusicService;
import com.android.project.abcappen.R;
import com.android.project.abcappen.services.Sounds;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ProfileDatabaseHelper profileDatabaseHelper;
    ArrayAdapter<String>adapter;

    private Sounds sounds;
    private Button addUserButton, progressButton;
    private ListView userList;
    private TextView addUser;
    private ArrayList<String> userNameList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        profileDatabaseHelper = new ProfileDatabaseHelper(getApplicationContext());
        sounds = new Sounds(this);

        Intent backgroundMusic = new Intent(this,BackgroundMusicService.class);
        startService(backgroundMusic);


        userList = findViewById(R.id.userListView);
        addUserButton = findViewById(R.id.addUserTestBtn);
        progressButton = findViewById(R.id.framstegBtn);
        progressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.playPopSound();
                startActivity(new Intent(getApplicationContext(), GameActivity.class));
            }
        });
        addUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sounds.playPopSound();
                addUserDialog();

            }
        });


        userNameList = profileDatabaseHelper.getAllProfiles();
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,android.R.id.text1,userNameList);
        userList.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        userList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                //ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String  itemValue = (String) userList.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
            }
        });

    }

    private void addUserDialog(){
        final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.user_list_dialog_layout);
                dialog.setTitle("Add user");

                Button dialogButton = (Button) dialog.findViewById(R.id.addUserBtn);
                final EditText addUserText = (EditText) dialog.findViewById(R.id.editText_addUser);

                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sounds.playPopSound();
                        String username = addUserText.getText().toString();
                        profileDatabaseHelper.addProfile(username);
                        userNameList = profileDatabaseHelper.getAllProfiles();
                        adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,userNameList);
                        userList.setAdapter(adapter);
                        dialog.dismiss();
                    }
                });

                dialog.show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent backgroundMusic = new Intent(this,BackgroundMusicService.class);
        stopService(backgroundMusic);
    }
}
