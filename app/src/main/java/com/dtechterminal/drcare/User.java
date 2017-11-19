package com.dtechterminal.drcare;
public class User {
    private String name;
    private String email;
    private String phone_num;
    private String flogin;
    private String utype;
    public User(){

    }

    public String getEmail() {
        return email;
    }
    public String getuType(){ return utype;}
    public void setuType(String utype){ this.utype = utype;}

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFlogin(String flogin){
        this.flogin = flogin;
    }

    public String getFlogin(){ return flogin; }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
}