package com.expressbook.service;

import com.expressbook.controller.UserController;
import com.expressbook.dao.PostDao;
import com.expressbook.dao.UserDao;
import com.expressbook.model.LoggedUserDetails;
import com.expressbook.model.Post;
import com.expressbook.model.User;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Service
public class PostService {

    @Autowired
    PostDao postDao;

    @Autowired
    UserDao userDao;
    
    @Autowired
    UserController userController;
    
    @Autowired
    LoggedUserDetails loggedUserDetails;

    public void save(HttpServletRequest request,
            @RequestParam CommonsMultipartFile[] fileUpload) {
        Map<String, String[]> map = request.getParameterMap();

        User user = new User();
        user.setUser_id(loggedUserDetails.getUser_id());
        user.setFull_name(loggedUserDetails.getFull_name());
       user.setSurname(loggedUserDetails.getSurname());
       user.setMob_email(loggedUserDetails.getMob_email());
       user.setPass(loggedUserDetails.getPass());
       user.setDob(loggedUserDetails.getDob());
       user.setGender(loggedUserDetails.getGender());
       
        String desc = map.get("desc")[0];
        
        Post post = new Post();
        post.setDescription(desc);
        for (CommonsMultipartFile aFile : fileUpload){
        post.setImg(aFile.getBytes());
        }
       post.setPostOrupdate_date(new Date());
        post.setUser(user);
        
        Set<Post> postList = new HashSet<Post>();
        postList.add(post);
        
        user.setPosts(postList);
        
        postDao.save(user);

    }
  
}
