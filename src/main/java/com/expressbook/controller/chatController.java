package com.expressbook.controller;

import com.expressbook.dao.PostDao;
import com.expressbook.dao.SubPostDao;
import com.expressbook.dao.UserDao;
import com.expressbook.model.LoggedUserDetails;
import com.expressbook.model.Post;
import com.expressbook.model.Subpost;
import com.expressbook.model.User;
import com.expressbook.service.UserService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/chat")
public class chatController {
    
    @Autowired
    UserDao userDao;
    
    @Autowired
    LoggedUserDetails loggedUserDetails;
    
    @RequestMapping(value = "/chatPage") 
    public ModelAndView chatPage(ModelMap model){
        int LoggedUserId = loggedUserDetails.getUser_id();
        model.put("LoggedUserId", LoggedUserId);
        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        Map<String, Object> map = new HashMap<String, Object>();
        List<User> userList = userDao.getAll();
        map.put("userList", userList);
//        List<Post> postList = postDao.getAll();
//        map.put("postList", postList);
//        List<Subpost> subpostList = subPostDao.getAll();
//        map.put("subpostList", subpostList);
        return new ModelAndView("chat/newsFeedMessages", "map", map);
    }
    
}
