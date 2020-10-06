package com.expressbook.dao;

import com.expressbook.model.About;
import com.expressbook.model.LoggedUserDetails;
import com.expressbook.model.Post;
import com.expressbook.model.Subpost;
import com.expressbook.model.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SubPostDao{
    
    @Autowired
    SessionFactory sessionFactory;
    
    @Autowired
    LoggedUserDetails loggedUserDetails;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //    method for insert value with post_id(Post) foreign key
    @Transactional
    public void save(Post post ){
        sessionFactory.getCurrentSession().saveOrUpdate(post);
        sessionFactory.getCurrentSession().flush();
    }
    
    @Transactional
    public void save(User user ){
        sessionFactory.getCurrentSession().saveOrUpdate(user);
        sessionFactory.getCurrentSession().flush();
    }
    
    @Transactional
    public List<Subpost> getAll() {      
         String sql = "from Subpost";
         List<Subpost> subPostList = getSessionFactory().openSession().createQuery(sql).list();
         return subPostList;
    }
    
}
