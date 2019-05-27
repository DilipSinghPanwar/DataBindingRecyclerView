package com.databinding.multiobjects;

public class SecondUser {

    private String userName;
    private String userEmail;
    private String userMobNo;
    private String userAddress;

    public SecondUser() {
    }

    public SecondUser(String userName, String userEmail, String userMobNo, String userAddress) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userMobNo = userMobNo;
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMobNo() {
        return userMobNo;
    }

    public void setUserMobNo(String userMobNo) {
        this.userMobNo = userMobNo;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

}