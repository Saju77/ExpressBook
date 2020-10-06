package com.expressbook.controller;

import com.expressbook.dao.AboutDao;
import com.expressbook.dao.FriendsReqDao;
import com.expressbook.dao.PostDao;
import com.expressbook.dao.SubPostDao;
import com.expressbook.dao.UserDao;
import com.expressbook.model.About;
import com.expressbook.model.FriendsReq;
import com.expressbook.model.LoggedUserDetails;
import com.expressbook.model.Post;
import com.expressbook.model.Subpost;
import com.expressbook.model.User;
import com.expressbook.service.UserService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;
    
    @Autowired
    UserDao userDao;

    @Autowired
    PostDao postDao;

    @Autowired
    LoggedUserDetails loggedUserDetail;

    @Autowired
    LoggedUserDetails loggedUserDetails;

    @Autowired
    SubPostDao subPostDao;
    
    @Autowired
    FriendsReqDao friendsReqDao;
    
    @Autowired
    AboutDao aboutDao;

    @RequestMapping(value = "/welcome")
    public String welcomePage(ModelMap model) {
        String name = "Saju Ahmed";
        model.addAttribute("name", name);
        System.out.println("Hit by welcome");
        return "user/welcome";
    }

    @RequestMapping(value = "/newsFeed")
    public ModelAndView homePage(ModelMap model) {
        int LoggedUserId = loggedUserDetails.getUser_id();
        model.put("LoggedUserId", LoggedUserId);
        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        Map<String, Object> map = new HashMap<String, Object>(); 
        List<About> aboutList = aboutDao.getAll();
        map.put("aboutList", aboutList);
        List<Subpost> subpostList = subPostDao.getAll();
        map.put("subpostList", subpostList);
        List<User> userList = userDao.getAll();
        map.put("userList", userList);
        List<Post> postList = postDao.getAll();
        map.put("postList", postList);
        List<FriendsReq> freqList = friendsReqDao.getAll();
        map.put("freqList", freqList);
        return new ModelAndView("user/newsFeed", "map", map);
    }

    @RequestMapping(value = "/userRegister")
    public String userRegisterPage() {
        System.out.println("Hit by RegisterPage");
        return "user/userRegister";
    }

    @RequestMapping(value = "/userLogin")
    public String userLoginPage() {
        System.out.println("hit by loginPage");
        return "user/userLogin";
    }

    @RequestMapping(value = "/userRegister", method = RequestMethod.POST)
    public ModelAndView userRegistation(ModelMap model, HttpServletRequest request) {
//        surname, mob_email, pass, dob, gender
        Map<String, String[]> map = request.getParameterMap();
        loggedUserDetail.setFull_name(map.get("full_name")[0]);
        loggedUserDetail.setSurname(map.get("surname")[0]);
        loggedUserDetail.setMob_email(map.get("mob_email")[0]);
        loggedUserDetail.setPass(map.get("password")[0]);
        String fronEndDateString = map.get("dob")[0];
        Date dateObject = new Date();
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateObject = simpleDate.parse(fronEndDateString);
        } catch (ParseException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        loggedUserDetail.setDob(dateObject);
        loggedUserDetail.setGender(map.get("gender")[0]);
        System.out.println("From UserController(userReg) Gender = "+loggedUserDetail.getGender());

        userService.userRegister(request);
        return new ModelAndView("user/userLogin");
    }
    @Autowired
    SessionFactory sessionFactory;

    @RequestMapping(value = "/userLoginAction", method = RequestMethod.POST)
    @Transactional
    public ModelAndView userLogin(ModelMap model, HttpServletRequest request) {
        Map<String, String[]> map1 = request.getParameterMap();
        User user = userService.LoggedUser(request);
        model.put("loggedUser", user);
        loggedUserDetails.setUser_id(user.getUser_id());
        loggedUserDetails.setFull_name(user.getFull_name());
        loggedUserDetails.setSurname(user.getSurname());
        loggedUserDetails.setMob_email(user.getMob_email());
        loggedUserDetails.setPass(user.getPass());
        loggedUserDetails.setDob(user.getDob());
        loggedUserDetails.setGender(user.getGender());

        System.out.println("From UserController(userLoginAction) Logged user_id = " + loggedUserDetails.getUser_id() + " , Logged user_dob = " + loggedUserDetails.getDob());

        
        Map<String, Object> map = new HashMap<String, Object>();
        List<About> aboutList = aboutDao.getAll();
        map.put("aboutList", aboutList);
        int LoggedUserId = loggedUserDetails.getUser_id();
        model.put("LoggedUserId", LoggedUserId);
        List<User> userList = userDao.getAll();
        map.put("userList", userList);
        List<Post> postList = postDao.getAll();
        map.put("postList", postList);
        List<Subpost> subpostList = subPostDao.getAll();
        map.put("subpostList", subpostList);
        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        List<FriendsReq> freqList = friendsReqDao.getAll();
        map.put("freqList", freqList);
        List<FriendsReq> friendsList = friendsReqDao.getAllFriends();
        map.put("friendsList", friendsList);
        
        boolean action = userService.userLogin(request);
        if (action) {
            return new ModelAndView("user/newsFeed", "map", map);
//            return new ModelAndView("user/welcome");
        } else {
            return new ModelAndView("user/404ErrorPage");
        }
    }
}

@Controller
class IndexController {

    @RequestMapping(value = "/")
    public String indexPage() {
        System.out.println("hit by IndexPage");
        return "user/userLogin";
    }

}
