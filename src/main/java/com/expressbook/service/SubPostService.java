package com.expressbook.service;

import com.expressbook.dao.PostDao;
import com.expressbook.dao.SubPostDao;
import com.expressbook.model.LoggedUserDetails;
import com.expressbook.model.Post;
import com.expressbook.model.Subpost;
import com.expressbook.model.User;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubPostService {

    @Autowired
    SubPostDao subPostDao;

    @Autowired
    LoggedUserDetails loggedUserDetails;

    @Autowired
    PostDao postDao;

    public void save(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();

        User userCom = new User();
        userCom.setUser_id(loggedUserDetails.getUser_id());
        userCom.setFull_name(loggedUserDetails.getFull_name());
        userCom.setSurname(loggedUserDetails.getSurname());
        userCom.setMob_email(loggedUserDetails.getMob_email());
        userCom.setPass(loggedUserDetails.getPass());
        userCom.setDob(loggedUserDetails.getDob());
        userCom.setGender(loggedUserDetails.getGender());
        
        User user = new User();
        user.setUser_id(loggedUserDetails.getGetPost_user_user_id());
        user.setFull_name(loggedUserDetails.getGetPost_user_full_name());
        user.setSurname(loggedUserDetails.getGetPost_user_surname());
        user.setMob_email(loggedUserDetails.getGetPost_user_mob_email());
        user.setPass(loggedUserDetails.getGetPost_user_pass());
        user.setDob(loggedUserDetails.getGetPost_user_dob());
        user.setGender(loggedUserDetails.getGetPost_user_gender());

        Post post = new Post();
        post.setPost_id(loggedUserDetails.getGetPostByIdPost_id());
        post.setDescription(loggedUserDetails.getGetPostByIdDescription());
        post.setImg(loggedUserDetails.getGetPostByIdImg());
        post.setPostOrupdate_date(loggedUserDetails.getGetPostByIdPostOrupdate_date());
        post.setUser(user);

        Set<Post> postList = new HashSet<Post>();
        postList.add(post);

        user.setPosts(postList);

        postDao.save(user);

        String comment = map.get("comment")[0];

        Subpost subpost = new Subpost();
        subpost.setComments(comment);
        subpost.setPost(post);
        subpost.setUser(userCom);

        Set<Subpost> subPostList = new HashSet<Subpost>();
        subPostList.add(subpost);

        post.setSubposts(subPostList);

        subPostDao.save(post);

        subPostDao.save(user);

    }

}
