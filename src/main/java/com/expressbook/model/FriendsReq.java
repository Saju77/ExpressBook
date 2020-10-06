package com.expressbook.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FriendsReq {
 
    @Id
    private int f_id;
    private int from_user_id;
    private String from_full_name;
    private String from_mob_email;
    private String from_gender;
    private int to_user_id;
    private String to_full_name;
    private String to_mob_email;
    private String to_gender;
    private int status;

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public int getFrom_user_id() {
        return from_user_id;
    }

    public void setFrom_user_id(int from_user_id) {
        this.from_user_id = from_user_id;
    }

    public String getFrom_full_name() {
        return from_full_name;
    }

    public void setFrom_full_name(String from_full_name) {
        this.from_full_name = from_full_name;
    }

    public String getFrom_mob_email() {
        return from_mob_email;
    }

    public void setFrom_mob_email(String from_mob_email) {
        this.from_mob_email = from_mob_email;
    }

    public String getFrom_gender() {
        return from_gender;
    }

    public void setFrom_gender(String from_gender) {
        this.from_gender = from_gender;
    }

    public int getTo_user_id() {
        return to_user_id;
    }

    public void setTo_user_id(int to_user_id) {
        this.to_user_id = to_user_id;
    }

    public String getTo_full_name() {
        return to_full_name;
    }

    public void setTo_full_name(String to_full_name) {
        this.to_full_name = to_full_name;
    }

    public String getTo_mob_email() {
        return to_mob_email;
    }

    public void setTo_mob_email(String to_mob_email) {
        this.to_mob_email = to_mob_email;
    }

    public String getTo_gender() {
        return to_gender;
    }

    public void setTo_gender(String to_gender) {
        this.to_gender = to_gender;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
