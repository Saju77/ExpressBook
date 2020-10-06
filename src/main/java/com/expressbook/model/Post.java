package com.expressbook.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Post {
//    , desc, img, postOrupdate_date, user_id;

    private int post_id;
    private String description;
    private byte[] img;
    private Date postOrupdate_date;
    private User user;
    private Set<Subpost> Subposts;

    @Id
    @GeneratedValue
    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public Date getPostOrupdate_date() {
        return postOrupdate_date;
    }

    public void setPostOrupdate_date(Date postOrupdate_date) {
        this.postOrupdate_date = postOrupdate_date;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    public Set<Subpost> getSubposts() {
        return Subposts;
    }

    public void setSubposts(Set<Subpost> Subposts) {
        this.Subposts = Subposts;
    }
    
    

}
