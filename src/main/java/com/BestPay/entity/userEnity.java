package com.BestPay.entity;

import java.io.Serializable;

public class userEnity implements Serializable{
    private int userID;
    private String userName;
    private String password;
    private  String sex;

    public  String getSex(){return sex;}
    public  void  setSex(String sex){this.sex=sex;}

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "userEnity [userID=" + userID + ", userName=" + userName + ", password="
                + password + "]";
    }
}
