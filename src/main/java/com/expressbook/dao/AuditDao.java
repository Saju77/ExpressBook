package com.expressbook.dao;

import com.expressbook.model.Audit;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AuditDao {
    
    @Autowired
    SessionFactory sessionFactory;

    public SessionFactory getSessionfactory() {
        return sessionFactory;
    }

    public void setSessionfactory(SessionFactory sessionfactory) {
        this.sessionFactory = sessionfactory;
    }
    
    @Transactional
    public void Save(Audit audit) {
        sessionFactory.getCurrentSession().saveOrUpdate(audit);
        sessionFactory.getCurrentSession().flush();
    }
    
    @Transactional
    public List<Audit> getAll() {
         String sql = "from Audit ORDER BY date DESC";
         List<Audit> postList = getSessionfactory().openSession().createQuery(sql).list();
         return postList;
    }
    
}
