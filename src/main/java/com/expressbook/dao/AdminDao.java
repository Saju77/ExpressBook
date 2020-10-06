package com.expressbook.dao;

import com.expressbook.model.Audit;
import com.expressbook.model.User;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AdminDao {
    
    @Autowired
    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Transactional
    public List<User> getAllUser() {
        List<User> userList = sessionFactory.getCurrentSession().createCriteria(User.class).list();
        sessionFactory.getCurrentSession().flush();
        return userList;
    }
    
//    @Transactional
//    public List<Audit> getAllAudit() {
//        List<Audit> auditList = sessionFactory.getCurrentSession().createCriteria(Audit.class).list();
//        sessionFactory.getCurrentSession().flush();
//        return auditList;
//    }
    
    @Transactional
    public List<Audit> getAllAudit() {
         String sql = "from Audit order by date desc";
         List<Audit> auditList = getSessionFactory().openSession().createQuery(sql).list();
         return auditList;
    }
    
    @Transactional
    public User delete(int id) {
        User user = (User) sessionFactory.getCurrentSession().load(User.class, id);
        sessionFactory.getCurrentSession().delete(user);
        sessionFactory.getCurrentSession().flush();
        return user;
    }
    
}
