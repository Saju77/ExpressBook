package com.expressbook.dao;

import com.expressbook.model.FriendsReq;
import com.expressbook.model.LoggedUserDetails;
import com.expressbook.model.User;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class FriendsReqDao {
    
    @Autowired
    LoggedUserDetails loggedUserDetails;
    
    @Autowired
    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Transactional
    public void save(FriendsReq freq) {
        sessionFactory.getCurrentSession().saveOrUpdate(freq);
        sessionFactory.getCurrentSession().flush();
    }
    
    @Transactional
    public List<FriendsReq> getAll() {
        List<FriendsReq> fReqList = sessionFactory.getCurrentSession().createCriteria(FriendsReq.class).list();
        sessionFactory.getCurrentSession().flush();
        return fReqList;
    }
    
//    find out all request which is requested to me by to_user_id
    @Transactional
    public List<FriendsReq> getAllReq() {
        String sql = "from FriendsReq where to_user_id = '" + loggedUserDetails.getUser_id() + "'";
        List<FriendsReq> friendsReqList = getSessionFactory().openSession().createQuery(sql).list();
        return friendsReqList;
    }
    
    @Transactional
    public List<FriendsReq> getAllFriends() {
        String sql = "from FriendsReq where from_user_id = '" + loggedUserDetails.getUser_id() + "'";
        List<FriendsReq> friendsList = getSessionFactory().openSession().createQuery(sql).list();
        return friendsList;
    }
    
    @Transactional
    public FriendsReq update(FriendsReq friendsReq) {
        sessionFactory.getCurrentSession().update(friendsReq);
        sessionFactory.getCurrentSession().flush();
        return friendsReq;
    }
    
    @Transactional
    public FriendsReq getById(int id) {
        FriendsReq friendsReq = (FriendsReq) sessionFactory.getCurrentSession().get(FriendsReq.class, id);
        sessionFactory.getCurrentSession().flush();
        return friendsReq;
    }
    
    @Transactional
    public FriendsReq delete(int id) {
        FriendsReq friendsReq = (FriendsReq) sessionFactory.getCurrentSession().load(FriendsReq.class, id);
        sessionFactory.getCurrentSession().delete(friendsReq);
        sessionFactory.getCurrentSession().flush();
        return friendsReq;
    }
    
}
