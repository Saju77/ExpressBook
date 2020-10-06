package com.expressbook.model;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class FriendsReqToDatails {
    
    private int fReqTo_user_id;
    private String fReqTo_full_name;
    private String fReqTo_surname;
    private String fReqTo_mob_email;
    private String fReqTo_pass;
    private Date fReqTo_dob;
    private String fReqTo_gender;

    public int getfReqTo_user_id() {
        return fReqTo_user_id;
    }

    public void setfReqTo_user_id(int fReqTo_user_id) {
        this.fReqTo_user_id = fReqTo_user_id;
    }

    public String getfReqTo_full_name() {
        return fReqTo_full_name;
    }

    public void setfReqTo_full_name(String fReqTo_full_name) {
        this.fReqTo_full_name = fReqTo_full_name;
    }

    public String getfReqTo_surname() {
        return fReqTo_surname;
    }

    public void setfReqTo_surname(String fReqTo_surname) {
        this.fReqTo_surname = fReqTo_surname;
    }

    public String getfReqTo_mob_email() {
        return fReqTo_mob_email;
    }

    public void setfReqTo_mob_email(String fReqTo_mob_email) {
        this.fReqTo_mob_email = fReqTo_mob_email;
    }

    public String getfReqTo_pass() {
        return fReqTo_pass;
    }

    public void setfReqTo_pass(String fReqTo_pass) {
        this.fReqTo_pass = fReqTo_pass;
    }

    public Date getfReqTo_dob() {
        return fReqTo_dob;
    }

    public void setfReqTo_dob(Date fReqTo_dob) {
        this.fReqTo_dob = fReqTo_dob;
    }

    public String getfReqTo_gender() {
        return fReqTo_gender;
    }

    public void setfReqTo_gender(String fReqTo_gender) {
        this.fReqTo_gender = fReqTo_gender;
    }

    
    
}
