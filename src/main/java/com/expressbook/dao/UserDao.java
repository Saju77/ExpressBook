package com.expressbook.dao;

import com.expressbook.model.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {

    @Autowired
    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void userRegister(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
        sessionFactory.getCurrentSession().flush();
    }

    @Transactional
    public User userLogin(User user) {
        String sql = "from User where mob_email = '" + user.getMob_email() + "'";
        List<User> u = getSessionFactory().openSession().createQuery(sql).list();
        return u.get(0);
    }

    @Transactional
    public User getByMob_email(String mob_email) {
        Query query = sessionFactory.getCurrentSession().createQuery("from User where mob_email=:email");
        query.setParameter("email", mob_email);
        User user = (User) query.setMaxResults(1).uniqueResult();
        return user;
    }
    
    @Transactional
    public List<User> getAll() {
        List<User> userList = sessionFactory.getCurrentSession().createCriteria(User.class).list();
        sessionFactory.getCurrentSession().flush();
        return userList;
    }

    @Transactional
    public User getById(int id) {
        User user = (User) sessionFactory.getCurrentSession().get(User.class, id);
        sessionFactory.getCurrentSession().flush();
        return user;
    }
    
}
