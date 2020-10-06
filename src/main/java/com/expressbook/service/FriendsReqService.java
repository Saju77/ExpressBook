package com.expressbook.service;

import com.expressbook.dao.FriendsReqDao;
import com.expressbook.model.FriendsReq;
import com.expressbook.model.FriendsReqToDatails;
import com.expressbook.model.LoggedUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendsReqService {
    
    @Autowired
    LoggedUserDetails loggedUserDetails;
    
    @Autowired
    FriendsReqToDatails friendsReqToDatails;
    
    @Autowired
    FriendsReqDao friendsReqDao;
    
    public void save(){
// from_user_id, from_full_name, from_mob_email, from_gender, to_user_id, to_full_name, to_mob_email, to_gender
        FriendsReq freq = new FriendsReq();
        freq.setFrom_user_id(loggedUserDetails.getUser_id());
        freq.setFrom_full_name(loggedUserDetails.getFull_name());
        freq.setFrom_mob_email(loggedUserDetails.getMob_email());
        freq.setFrom_gender(loggedUserDetails.getGender());
        freq.setTo_user_id(friendsReqToDatails.getfReqTo_user_id());
        freq.setTo_full_name(friendsReqToDatails.getfReqTo_full_name());
        freq.setTo_mob_email(friendsReqToDatails.getfReqTo_mob_email());
        freq.setTo_gender(friendsReqToDatails.getfReqTo_gender());
        freq.setStatus(0);
        
        friendsReqDao.save(freq);
    
    }
    
    public FriendsReq updateById(int id){
// from_user_id, from_full_name, from_mob_email, from_gender, to_user_id, to_full_name, to_mob_email, to_gender
        FriendsReq freq = friendsReqDao.getById(id);
        FriendsReq friendsReq =new FriendsReq();
        friendsReq.setF_id(freq.getF_id());
        friendsReq.setFrom_user_id(freq.getFrom_user_id());
        friendsReq.setFrom_full_name(freq.getFrom_full_name());
        friendsReq.setFrom_mob_email(freq.getFrom_mob_email());
        friendsReq.setFrom_gender(freq.getFrom_gender());
        friendsReq.setTo_user_id(freq.getTo_user_id());
        friendsReq.setTo_full_name(freq.getTo_full_name());
        friendsReq.setTo_mob_email(freq.getTo_mob_email());
        friendsReq.setTo_gender(freq.getTo_gender());
        friendsReq.setStatus(1);
        
        friendsReqDao.update(friendsReq);
        
        return friendsReq;
    
    }
    
}
