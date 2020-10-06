package com.expressbook.dao;

import com.expressbook.model.About;
import com.expressbook.model.LoggedUserDetails;
import com.expressbook.model.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AboutDao {

    @Autowired
    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    LoggedUserDetails loggedUserDetails;

    //    method for insert value with user_id(User) foreign key
    @Transactional
    public void save(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
        sessionFactory.getCurrentSession().flush();
    }

    @Transactional
    public List<About> getAll() {
         String sql = "from About";
         List<About> aboutList = getSessionFactory().openSession().createQuery(sql).list();
         return aboutList;
    }
    
    @Transactional
    public About getAboutByUserId(int user_id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from About where user_id=:user_id");
        query.setParameter("user_id", user_id);
        About about = (About) query.setMaxResults(1).uniqueResult();
        return about;

    }
    
    @Transactional
    public About getById(int id) {
        About about = (About) sessionFactory.getCurrentSession().get(About.class, id);
        sessionFactory.getCurrentSession().flush();
        return about;
    }

}
