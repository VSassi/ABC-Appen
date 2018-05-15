package com.android.project.abcappen.services;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import com.android.project.abcappen.R;

import java.util.Random;

public class Sounds {

    private static SoundPool soundPool;
    private static int complete,pop,failOne,failTwo,failThree,gitar1,gitar2,gitar3,gitar4,gitar5,gitar6,gitar7,gitar8;
    private static int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,å,ä,ö;
    int sound=0;



    public Sounds(Context context){

        soundPool = new SoundPool(43, AudioManager.STREAM_MUSIC,0);
        pop = soundPool.load(context, R.raw.pop_sound,1);
        failOne = soundPool.load(context,R.raw.fail_one,1);
        failTwo = soundPool.load(context,R.raw.fail_two,1);
        failThree = soundPool.load(context,R.raw.fail_three,1);
        complete = soundPool.load(context,R.raw.level_completed,1);
        gitar1 = soundPool.load(context,R.raw.gitar_1,1);
        gitar2 = soundPool.load(context,R.raw.gitar_2,1);
        gitar3 = soundPool.load(context,R.raw.gitar_3,1);
        gitar4 = soundPool.load(context,R.raw.gitar_4,1);
        gitar5 = soundPool.load(context,R.raw.gitar_5,1);
        gitar6 = soundPool.load(context,R.raw.gitar_6,1);
        gitar7 = soundPool.load(context,R.raw.gitar_7,1);
        gitar8 = soundPool.load(context,R.raw.gitar_8,1);

        a = soundPool.load(context,R.raw.a_ljud,1);
        b = soundPool.load(context,R.raw.b_ljud,1);
        c = soundPool.load(context,R.raw.c_ljud,1);
        d = soundPool.load(context,R.raw.d_ljud,1);
        e = soundPool.load(context,R.raw.e_ljud,1);
        f = soundPool.load(context,R.raw.f_ljud,1);
        g = soundPool.load(context,R.raw.g_ljud,1);
        h = soundPool.load(context,R.raw.h_ljud,1);
        i = soundPool.load(context,R.raw.i_ljud,1);
        j = soundPool.load(context,R.raw.j_ljud,1);
        k = soundPool.load(context,R.raw.k_ljud,1);
        l = soundPool.load(context,R.raw.l_ljud,1);
        m = soundPool.load(context,R.raw.m_ljud,1);
        n = soundPool.load(context,R.raw.n_ljud,1);
        o = soundPool.load(context,R.raw.o_ljud,1);
        p = soundPool.load(context,R.raw.p_ljud,1);
        q = soundPool.load(context,R.raw.q_ljud,1);
        r = soundPool.load(context,R.raw.r_ljud,1);
        s = soundPool.load(context,R.raw.s_ljud,1);
        t = soundPool.load(context,R.raw.t_ljud,1);
        u = soundPool.load(context,R.raw.u_ljud,1);
        v = soundPool.load(context,R.raw.v_ljud,1);
        w = soundPool.load(context,R.raw.w_ljud,1);
        x = soundPool.load(context,R.raw.x_ljud,1);
        y = soundPool.load(context,R.raw.y_ljud,1);
        z = soundPool.load(context,R.raw.z_ljud,1);
        å = soundPool.load(context,R.raw.a_med_1_prick_ljud,1);
        ä = soundPool.load(context,R.raw.a_med_2_prickar_ljud,1);
        ö = soundPool.load(context,R.raw.o_med_2_prickar_ljud,1);

    }

    public void playMelodySound() {
        sound =sound +1;

        if (sound == 1) {

            soundPool.play(gitar1, 1.0f, 1.0f, 1, 0, 1.0f);
        }
        if (sound == 2) {
            soundPool.play(gitar2, 1.0f, 1.0f, 1, 0, 1.0f);
        }
        if (sound == 3) {
            soundPool.play(gitar3, 1.0f, 1.0f, 1, 0, 1.0f);
        }
        if (sound == 4) {
            soundPool.play(gitar4, 1.0f, 1.0f, 1, 0, 1.0f);
        }
        if (sound == 5) {
            soundPool.play(gitar5, 1.0f, 1.0f, 1, 0, 1.0f);
        }
        if (sound == 6){
            soundPool.play(gitar6, 1.0f, 1.0f, 1, 0, 1.0f);
        }
        if(sound==7) {
                soundPool.play(gitar7, 1.0f, 1.0f, 1, 0, 1.0f);
        }
        if(sound==8) {
                soundPool.play(gitar8, 1.0f, 1.0f, 1, 0, 1.0f);
                sound = 0;
        }

    }
    public void playFailSound(){

        int n = new Random().nextInt(2);

        if (n==1) {
            soundPool.play(failOne, 1.0f, 1.0f, 1, 0, 1.0f);
        }else{
        soundPool.play(failThree, 1.0f, 1.0f, 1, 0, 1.0f);}
    }
    public void playPopSound(){
        soundPool.play(pop, 1.0f, 1.0f, 1, 0, 1.0f);

    }
    public void playComplete(){
        soundPool.play(complete,1.0f,1.0f,1,0,1.0f);
    }
    public void playLetter(char letter){
        switch (letter){
            case 'A':
                soundPool.play(a,2.0f,2.0f,0,0,0);
                break;
            case 'B':
                soundPool.play(b,2.0f,2.0f,0,0,0);
                break;
            case 'C':
                soundPool.play(c,2.0f,2.0f,0,0,0);
                break;
            case 'D':
                soundPool.play(d,2.0f,2.0f,0,0,0);
                break;
            case 'E':
                soundPool.play(e,2.0f,2.0f,0,0,0);
                break;
            case 'F':
                soundPool.play(f,2.0f,2.0f,0,0,0);
                break;
            case 'G':
                soundPool.play(g,2.0f,2.0f,0,0,0);
                break;
            case 'H':
                soundPool.play(h,2.0f,2.0f,0,0,0);
                break;
            case 'I':
                soundPool.play(i,2.0f,2.0f,0,0,0);
                break;
            case 'J':
                soundPool.play(j,2.0f,2.0f,0,0,0);
                break;
            case 'K':
                soundPool.play(k,2.0f,2.0f,0,0,0);
                break;
            case 'L':
                soundPool.play(l,2.0f,2.0f,0,0,0);
                break;
            case 'M':
                soundPool.play(m,2.0f,2.0f,0,0,0);
                break;
            case 'N':
                soundPool.play(n,2.0f,2.0f,0,0,0);
                break;
            case 'O':
                soundPool.play(o,2.0f,2.0f,0,0,0);
                break;
            case 'P':
                soundPool.play(p,2.0f,2.0f,0,0,0);
                break;
            case 'Q':
                soundPool.play(q,2.0f,2.0f,0,0,0);
                break;
            case 'R':
                soundPool.play(r,2.0f,2.0f,0,0,0);
                break;
            case 'S':
                soundPool.play(s,2.0f,2.0f,0,0,0);
                break;
            case 'T':
                soundPool.play(t,2.0f,2.0f,0,0,0);
                break;
            case 'U':
                soundPool.play(u,2.0f,2.0f,0,0,0);
                break;
            case 'V':
                soundPool.play(v,2.0f,2.0f,0,0,0);
                break;
            case 'W':
                soundPool.play(w,2.0f,2.0f,0,0,0);
                break;
            case 'X':
                soundPool.play(x,2.0f,2.0f,0,0,0);
                break;
            case 'Y':
                soundPool.play(y,2.0f,2.0f,0,0,0);
                break;
            case 'Z':
                soundPool.play(z,2.0f,2.0f,0,0,0);
                break;
            case 'Å':
                soundPool.play(å,2.0f,2.0f,0,0,0);
                break;
            case 'Ä':
                soundPool.play(ä,2.0f,2.0f,0,0,0);
                break;
            case 'Ö':
                soundPool.play(ö,2.0f,2.0f,0,0,0);
                break;


        }


    }
}

