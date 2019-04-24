package com.wj.entity;

public class User {
    private int userid;
    private String username;
    private String userpwd;
    private int userphone;
    private String useremail;
    private int userpow;
    //无参构造
    public User() {

    }
    //有参构造函数
    public User(int userid, String username, String userpwd, int userphone, String useremail, int userpow) {
        this.userid = userid;
        this.username = username;
        this.userpwd = userpwd;
        this.userphone = userphone;
        this.useremail = useremail;
        this.userpow = userpow;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public int getUserphone() {
        return userphone;
    }

    public void setUserphone(int userphone) {
        this.userphone = userphone;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public int getUserpow() {
        return userpow;
    }

    public void setUserpow(int userpow) {
        this.userpow = userpow;
    }
}
