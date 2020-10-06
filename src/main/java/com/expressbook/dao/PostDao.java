package com.expressbook.dao;

import com.expressbook.model.Post;
import com.expressbook.model.User;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PostDao {
    
    @Autowired
    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //    method for insert value with user_id(User) foreign key
    @Transactional
    public void save(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
        sessionFactory.getCurrentSession().flush();
    }
    
    @Transactional
    public List<Post> getAll() {
         String sql = "from Post order by postOrupdate_date desc";
         List<Post> postList = getSessionFactory().openSession().createQuery(sql).list();
         return postList;
    }
    
    @Transactional
    public Post getById(int id) {
        Post post = (Post) sessionFactory.getCurrentSession().get(Post.class, id);
        sessionFactory.getCurrentSession().flush();
        return post;
    }
    
}
