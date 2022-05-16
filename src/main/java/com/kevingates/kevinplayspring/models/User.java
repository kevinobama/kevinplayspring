package com.kevingates.kevinplayspring.models;

public class User {
    private UserProfile userProfile;

    public String getName() {
        return name+" This is user class";
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public User() {

    }

    User(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public String getUserInfo() {
        return "construction injection: user data and "+userProfile.getDetail();
    }

    public String getUserInfo1(UserProfile userProfile) {

        return "method injection:user data and "+userProfile.getDetail();
    }
}
