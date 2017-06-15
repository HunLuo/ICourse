package com.iss.java.model;

public class User {
    private Integer userinfoUserid;

    private String userinfoUsername;

    private String userinfoPassword;

    private Integer userType;

    public Integer getUserinfoUserid() {
        return userinfoUserid;
    }

    public void setUserinfoUserid(Integer userinfoUserid) {
        this.userinfoUserid = userinfoUserid;
    }

    public String getUserinfoUsername() {
        return userinfoUsername;
    }

    public void setUserinfoUsername(String userinfoUsername) {
        this.userinfoUsername = userinfoUsername == null ? null : userinfoUsername.trim();
    }

    public String getUserinfoPassword() {
        return userinfoPassword;
    }

    public void setUserinfoPassword(String userinfoPassword) {
        this.userinfoPassword = userinfoPassword == null ? null : userinfoPassword.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}