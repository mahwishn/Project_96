package com.example.dell_i5.lab6p;

/**
 * Created by Dell-i5 on 17/04/2018.
 */

public class DataModel {

    private String userName;
    private String userMsg;
    private String userTime;

    DataModel(String userName, String userMsg, String userTime) {
        this.userName = userName;
        this.userMsg = userMsg;
        this.userTime = userTime;

    }

    public String getUserName() {
        return userName;
    }

    public String getUserMsg() {
        return userMsg;
    }

    public String getUserTime() {
        return userTime;

    }
}
