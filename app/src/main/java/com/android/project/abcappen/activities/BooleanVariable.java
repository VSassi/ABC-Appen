package com.android.project.abcappen.activities;

/**
 * Created by martin on 2018-05-14.
 */

public class BooleanVariable {
    private boolean boo = false;
    private ChangeListener listener;

    public void setBoo(boolean boo) {
        this.boo = boo;
        System.out.println("boolean set");
        if (listener != null) {
            listener.onChange();
            System.out.println("ONCHANGE");
        }
    }

    public ChangeListener getListener() {
        return listener;
    }

    public void setListener(ChangeListener listener){
        this.listener = listener;
    }

    public interface ChangeListener {
        void onChange();
    }
}

