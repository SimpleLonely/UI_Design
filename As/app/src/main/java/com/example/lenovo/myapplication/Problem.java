package com.example.lenovo.myapplication;

/**
 * Created by lenovo on 2018/2/3.
 */

public class Problem {
    private String aName;
    private String aSpeak;
    private int aIcon;

    public Problem() {
    }

    public Problem(String aName, int aIcon) {
        this.aName = aName;
        //this.aSpeak = aSpeak;
        this.aIcon = aIcon;
    }

    public String getaName() {
        return aName;
    }

    public String getaSpeak() {
        return aSpeak;
    }

    public int getaIcon() {
        return aIcon;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public void setaSpeak(String aSpeak) {
        this.aSpeak = aSpeak;
    }

    public void setaIcon(int aIcon) {
        this.aIcon = aIcon;
    }
}
