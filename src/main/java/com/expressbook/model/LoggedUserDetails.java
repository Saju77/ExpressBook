package com.expressbook.model;

import java.util.Date;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Component
public class LoggedUserDetails {
   
    private int user_id;
    private String full_name;
    private String surname;
    private String mob_email;
    private String pass;
    private Date dob;
    private String gender;
//    GetPostById(Post)
    private int getPost_user_user_id;
    private String getPost_user_full_name;
    private String getPost_user_surname;
    private String getPost_user_mob_email;
    private String getPost_user_pass;
    private Date getPost_user_dob;
    private String getPost_user_gender;
    private int getPostByIdPost_id;
    private String getPostByIdDescription;
    private byte[] getPostByIdImg;
    private Date getPostByIdPostOrupdate_date;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMob_email() {
        return mob_email;
    }

    public void setMob_email(String mob_email) {
        this.mob_email = mob_email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGetPost_user_user_id() {
        return getPost_user_user_id;
    }

    public void setGetPost_user_user_id(int getPost_user_user_id) {
        this.getPost_user_user_id = getPost_user_user_id;
    }

    public String getGetPost_user_full_name() {
        return getPost_user_full_name;
    }

    public void setGetPost_user_full_name(String getPost_user_full_name) {
        this.getPost_user_full_name = getPost_user_full_name;
    }

    public String getGetPost_user_surname() {
        return getPost_user_surname;
    }

    public void setGetPost_user_surname(String getPost_user_surname) {
        this.getPost_user_surname = getPost_user_surname;
    }

    public String getGetPost_user_mob_email() {
        return getPost_user_mob_email;
    }

    public void setGetPost_user_mob_email(String getPost_user_mob_email) {
        this.getPost_user_mob_email = getPost_user_mob_email;
    }

    public String getGetPost_user_pass() {
        return getPost_user_pass;
    }

    public void setGetPost_user_pass(String getPost_user_pass) {
        this.getPost_user_pass = getPost_user_pass;
    }

    public Date getGetPost_user_dob() {
        return getPost_user_dob;
    }

    public void setGetPost_user_dob(Date getPost_user_dob) {
        this.getPost_user_dob = getPost_user_dob;
    }

    public String getGetPost_user_gender() {
        return getPost_user_gender;
    }

    public void setGetPost_user_gender(String getPost_user_gender) {
        this.getPost_user_gender = getPost_user_gender;
    }

    
    
    public int getGetPostByIdPost_id() {
        return getPostByIdPost_id;
    }

    public void setGetPostByIdPost_id(int getPostByIdPost_id) {
        this.getPostByIdPost_id = getPostByIdPost_id;
    }
    
    

    public String getGetPostByIdDescription() {
        return getPostByIdDescription;
    }

    public void setGetPostByIdDescription(String getPostByIdDescription) {
        this.getPostByIdDescription = getPostByIdDescription;
    }

    public byte[] getGetPostByIdImg() {
        return getPostByIdImg;
    }

    public void setGetPostByIdImg(byte[] getPostByIdImg) {
        this.getPostByIdImg = getPostByIdImg;
    }

    public Date getGetPostByIdPostOrupdate_date() {
        return getPostByIdPostOrupdate_date;
    }

    public void setGetPostByIdPostOrupdate_date(Date getPostByIdPostOrupdate_date) {
        this.getPostByIdPostOrupdate_date = getPostByIdPostOrupdate_date;
    }
    
    
    
}
