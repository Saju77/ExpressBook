package com.expressbook.service;

import com.expressbook.dao.AuditDao;
import com.expressbook.model.Audit;
import com.expressbook.model.LoggedUserDetails;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditService {
    
    @Autowired
    AuditDao auditDao;
    
    @Autowired
    LoggedUserDetails loggedUserDetail;
    
    @After("execution(* com.expressbook.controller.UserController.userRegistation(..))")
    public void userRegistation(JoinPoint joinPoint){
        Audit audit = new Audit();
        audit.setAction(joinPoint.getSignature().getName());
        audit.setUsername(loggedUserDetail.getFull_name());
        audit.setRole("user");
        audit.setMob_email(loggedUserDetail.getMob_email());
        audit.setPass(loggedUserDetail.getPass());
        audit.setDate(new Date());
        auditDao.Save(audit);
    }
    
    @After("execution(* com.expressbook.controller.UserController.userLogin(..))")
    public void userLogin(JoinPoint joinPoint){
        Audit audit = new Audit();
        audit.setAction(joinPoint.getSignature().getName());
        audit.setUsername(loggedUserDetail.getFull_name());
        audit.setRole("user");
        audit.setMob_email(loggedUserDetail.getMob_email());
        audit.setPass(loggedUserDetail.getPass());
        audit.setDate(new Date());
        auditDao.Save(audit);
    }
    
    @After("execution(* com.expressbook.controller.PostController.post(..))")
    public void post(JoinPoint joinPoint){
        Audit audit = new Audit();
        audit.setAction(joinPoint.getSignature().getName());
        audit.setUsername(loggedUserDetail.getFull_name());
        audit.setRole("user");
        audit.setMob_email(loggedUserDetail.getMob_email());
        audit.setPass(loggedUserDetail.getPass());
        audit.setDate(new Date());
        auditDao.Save(audit);
    }
    
    @After("execution(* com.expressbook.controller.SubPostController.comment(..))")
    public void comment(JoinPoint joinPoint){
        Audit audit = new Audit();
        audit.setAction(joinPoint.getSignature().getName());
        audit.setUsername(loggedUserDetail.getFull_name());
        audit.setRole("user");
        audit.setMob_email(loggedUserDetail.getMob_email());
        audit.setPass(loggedUserDetail.getPass());
        audit.setDate(new Date());
        auditDao.Save(audit);
    }
    
    @After("execution(* com.expressbook.controller.TimelineController.updateAbout(..))")
    public void updateAbout(JoinPoint joinPoint){
        Audit audit = new Audit();
        audit.setAction(joinPoint.getSignature().getName());
        audit.setUsername(loggedUserDetail.getFull_name());
        audit.setRole("user");
        audit.setMob_email(loggedUserDetail.getMob_email());
        audit.setPass(loggedUserDetail.getPass());
        audit.setDate(new Date());
        auditDao.Save(audit);
    }
    
    @After("execution(* com.expressbook.controller.TimelineController.saveAbout(..))")
    public void saveAbout(JoinPoint joinPoint){
        Audit audit = new Audit();
        audit.setAction(joinPoint.getSignature().getName());
        audit.setUsername(loggedUserDetail.getFull_name());
        audit.setRole("user");
        audit.setMob_email(loggedUserDetail.getMob_email());
        audit.setPass(loggedUserDetail.getPass());
        audit.setDate(new Date());
        auditDao.Save(audit);
    }
    
    @After("execution(* com.expressbook.controller.TimelineController.sentFriendRequest(..))")
    public void sentFriendRequest(JoinPoint joinPoint){
        Audit audit = new Audit();
        audit.setAction(joinPoint.getSignature().getName());
        audit.setUsername(loggedUserDetail.getFull_name());
        audit.setRole("user");
        audit.setMob_email(loggedUserDetail.getMob_email());
        audit.setPass(loggedUserDetail.getPass());
        audit.setDate(new Date());
        auditDao.Save(audit);
    }
    
    @After("execution(* com.expressbook.controller.TimelineController.viewFriendsAbout(..))")
    public void viewFriendsAbout(JoinPoint joinPoint){
        Audit audit = new Audit();
        audit.setAction(joinPoint.getSignature().getName());
        audit.setUsername(loggedUserDetail.getFull_name());
        audit.setRole("user");
        audit.setMob_email(loggedUserDetail.getMob_email());
        audit.setPass(loggedUserDetail.getPass());
        audit.setDate(new Date());
        auditDao.Save(audit);
    }
    
}
