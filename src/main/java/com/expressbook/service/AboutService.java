package com.expressbook.service;

import com.expressbook.controller.UserController;
import com.expressbook.dao.AboutDao;
import com.expressbook.dao.UserDao;
import com.expressbook.model.About;
import com.expressbook.model.LoggedUserDetails;
import com.expressbook.model.User;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Service
public class AboutService {
    
    @Autowired
    AboutDao aboutDao;
    
    @Autowired
    UserDao userDao;
    
    @Autowired
    UserController userController;
    
    @Autowired
    LoggedUserDetails loggedUserDetails;
    
    public void save(@RequestParam CommonsMultipartFile[] fileUpload,HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        
        User user = new User();
        user.setUser_id(loggedUserDetails.getUser_id());
        user.setFull_name(loggedUserDetails.getFull_name());
        user.setSurname(loggedUserDetails.getSurname());
        user.setMob_email(loggedUserDetails.getMob_email());
        user.setPass(loggedUserDetails.getPass());
        user.setDob(loggedUserDetails.getDob());
        user.setGender(loggedUserDetails.getGender());
        

        //    p_info, work_exp, location, interests, language, user_id(User)
        String p_info = map.get("p_info")[0];
        String work_exp = map.get("work_exp")[0];
        String location = map.get("location")[0];
        String interests = map.get("interests")[0];
        String languages = map.get("languages")[0];
        String aboutID = map.get("aboutID")[0];
        About about = new About();
        if(aboutID != ""){
         about.setAbout_id(Integer.parseInt(aboutID));
        }
        for (CommonsMultipartFile aFile : fileUpload){
        about.setP_pic(aFile.getBytes());
        }
        System.out.println("hit in the aboutService..............");
        about.setP_info(p_info);
        about.setWork_exp(work_exp);
        about.setLocation(location);
        about.setInterests(interests);
        about.setLanguages(languages);
        about.setUser(user);
        
        user.setAbout(about);
        
        aboutDao.save(user);
        
    }
    
}
