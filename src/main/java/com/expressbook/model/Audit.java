package com.expressbook.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Audit {

    @Id
    @Column(name = "audit_id")
    private int audit_id;

    @Column(name = "action")
    private String action;

    @Column(name = "username")
    private String username;

    @Column(name = "role")
    private String role;

    @Column(name = "mob_email")
    private String mob_email;

    @Column(name = "pass")
    private String pass;

    @Column(name = "date")
    private Date date;

    public int getAudit_id() {
        return audit_id;
    }

    public void setAudit_id(int audit_id) {
        this.audit_id = audit_id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
    
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
