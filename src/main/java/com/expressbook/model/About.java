package com.expressbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class About {
//    about_id, p_info, work_exp, location, interests, language, user_id(User)

    private int about_id;
    private byte[] p_pic;
    private String p_info;
    private String work_exp;
    private String location;
    private String interests;
    private String languages;
    private User user;

    @Id
    @GeneratedValue
    @Column(name = "about_id", unique = true, nullable = false)
    public int getAbout_id() {
        return about_id;
    }

    public void setAbout_id(int about_id) {
        this.about_id = about_id;
    }

    public byte[] getP_pic() {
        return p_pic;
    }

    public void setP_pic(byte[] p_pic) {
        this.p_pic = p_pic;
    }
    
    

    public String getP_info() {
        return p_info;
    }

    public void setP_info(String p_info) {
        this.p_info = p_info;
    }

    public String getWork_exp() {
        return work_exp;
    }

    public void setWork_exp(String work_exp) {
        this.work_exp = work_exp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
    
    @OneToOne
    @JoinColumn(name = "user_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
