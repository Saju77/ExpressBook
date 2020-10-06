package com.expressbook.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class User {

    private int user_id;
    private String full_name;
    private String surname;
    private String mob_email;
    private String pass;
    private Date dob;
    private String gender;
    private Set<Post> posts;
    private Set<Subpost> Subposts;
    private About about;

//     = new HashSet<Post>()
    @Id
    @GeneratedValue
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

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    public Set<Subpost> getSubposts() {
        return Subposts;
    }

    public void setSubposts(Set<Subpost> Subposts) {
        this.Subposts = Subposts;
    }
    
    

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    public About getAbout() {
        return about;
    }

    public void setAbout(About about) {
        this.about = about;
    }
    
}