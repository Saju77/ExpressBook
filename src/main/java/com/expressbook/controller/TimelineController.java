package com.expressbook.controller;

import com.expressbook.dao.AboutDao;
import com.expressbook.dao.FriendsReqDao;
import com.expressbook.dao.PostDao;
import com.expressbook.dao.SubPostDao;
import com.expressbook.dao.UserDao;
import com.expressbook.model.About;
import com.expressbook.model.FriendsReq;
import com.expressbook.model.FriendsReqToDatails;
import com.expressbook.model.LoggedUserDetails;
import com.expressbook.model.Post;
import com.expressbook.model.Subpost;
import com.expressbook.model.User;
import com.expressbook.service.AboutService;
import com.expressbook.service.FriendsReqService;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/timeline")
public class TimelineController {

    @Autowired
    AboutService aboutService;

    @Autowired
    AboutDao aboutDao;

    @Autowired
    LoggedUserDetails loggedUserDetails;

    @Autowired
    PostDao postDao;

    @Autowired
    SubPostDao subPostDao;

    @Autowired
    UserDao userDao;

    @Autowired
    FriendsReqToDatails friendsReqToDatails;

    @Autowired
    FriendsReqService friendsReqService;

    @Autowired
    FriendsReqDao friendsReqDao;

    @RequestMapping(value = "/timelinePage")
    public ModelAndView timeline(ModelMap model) {
        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        int LoggedUserId = loggedUserDetails.getUser_id();
        model.put("LoggedUserId", LoggedUserId);
        Map<String, Object> map = new HashMap<String, Object>();
        List<Post> postList = postDao.getAll();
        map.put("postList", postList);
        System.out.println("postlist ---- " + postList.get(0).getPost_id());
        System.out.println("From TimelineController(timeline) PostList = " + postList);
        List<Subpost> subpostList = subPostDao.getAll();
        map.put("subpostList", subpostList);
        return new ModelAndView("timeline/timeline", "map", map);
    }

    @RequestMapping(value = "/aboutPage")
    public ModelAndView about(ModelMap model) {
        int LoggedUserId = loggedUserDetails.getUser_id();
        model.put("LoggedUserId", LoggedUserId);
        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        Map<String, Object> map2 = new HashMap<String, Object>();
        About aboutList = aboutDao.getAboutByUserId(loggedUserDetails.getUser_id());
        map2.put("aboutList", aboutList);
        System.out.println("From AboutController(getAbout) = " + aboutList);
        return new ModelAndView("timeline/timelineAbout", "map", map2);
    }

    @RequestMapping(value = "/updatePage")
    public ModelAndView updateAbout(ModelMap model) {
        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        Map<String, Object> map2 = new HashMap<String, Object>();
        About aboutList = aboutDao.getAboutByUserId(loggedUserDetails.getUser_id());
        map2.put("aboutList", aboutList);
        System.out.println("From AboutController(getAbout) = " + aboutList);
        return new ModelAndView("timeline/createOrUpdateAbout", "map", map2);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveAbout(ModelMap model, HttpServletRequest request,
            @RequestParam CommonsMultipartFile[] fileUpload) throws Exception {

        if (fileUpload != null && fileUpload.length > 0) {
            for (CommonsMultipartFile aFile : fileUpload) {
                System.out.println("Saving file: " + aFile.getOriginalFilename());
                aboutService.save(fileUpload, request);
            }
        }

        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        Map<String, String[]> map = request.getParameterMap();
        System.out.println("From AboutController(save) = " + loggedUserDetails.getFull_name());
        Map<String, Object> map2 = new HashMap<String, Object>();
        About aboutList = aboutDao.getAboutByUserId(loggedUserDetails.getUser_id());
        map2.put("aboutList", aboutList);
        System.out.println("From AboutController(getAbout) = " + aboutList);
        return new ModelAndView("redirect:/timeline/aboutPage", "map", map2);
    }

    @RequestMapping(value = "/getAbout", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView getAboutById(ModelMap model) {    // Using ModelAndView for processing view and data
        Map<String, Object> map2 = new HashMap<String, Object>();
        About aboutList = aboutDao.getAboutByUserId(loggedUserDetails.getUser_id());
        map2.put("aboutList", aboutList);
        System.out.println("From TimelineController(getAbout) = " + aboutList);
        return new ModelAndView("timeline/timelineAbout", "map", map2);
    }

    @RequestMapping(value = "/imageDisplay", method = RequestMethod.GET)
    public void showImage(@RequestParam("id") Integer Id, HttpServletResponse response, HttpServletRequest request)
            throws ServletException, IOException {
        About about = aboutDao.getAboutByUserId(Id);
        response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        response.getOutputStream().write(about.getP_pic());
        response.getOutputStream().close();
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public ModelAndView update(ModelMap map, @PathVariable("id") int id) {
        About about = aboutDao.getById(id);
        map.addAttribute("about", about);
        return new ModelAndView("timeline/timelineAbout", "map", about);
    }

    @RequestMapping(value = "/albumPage")
    public ModelAndView album(ModelMap model) {
        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        int LoggedUserId = loggedUserDetails.getUser_id();
        model.put("LoggedUserId", LoggedUserId);
        Map<String, Object> map = new HashMap<String, Object>();
        List<Post> postList = postDao.getAll();
        map.put("postList", postList);
        System.out.println("postlist ---- " + postList.get(0).getPost_id());
        return new ModelAndView("timeline/timelineAlbum", "map", map);
    }

    @RequestMapping(value = "/friendsPage")
    public ModelAndView friends(ModelMap model) {
        int LoggedUserId = loggedUserDetails.getUser_id();
        model.put("LoggedUserId", LoggedUserId);
        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        Map<String, Object> map = new HashMap<String, Object>();
        List<FriendsReq> freqList = friendsReqDao.getAllReq();
        map.put("freqList", freqList);
        List<FriendsReq> friendsList = friendsReqDao.getAllFriends();
        map.put("friendsList", friendsList);
        return new ModelAndView("timeline/timelineFriends", "map", map);
    }

    @RequestMapping(value = "/fReqSave/{id}", method = RequestMethod.GET)
    public ModelAndView sentFriendRequest(ModelMap model, @PathVariable("id") int id) {
//        user_id, full_name, surname, mob_email, pass, dob, gender
        User user = userDao.getById(id);
        friendsReqToDatails.setfReqTo_user_id(user.getUser_id());
        friendsReqToDatails.setfReqTo_full_name(user.getFull_name());
        friendsReqToDatails.setfReqTo_surname(user.getSurname());
        friendsReqToDatails.setfReqTo_mob_email(user.getMob_email());
        friendsReqToDatails.setfReqTo_pass(user.getPass());
        friendsReqToDatails.setfReqTo_dob(user.getDob());
        friendsReqToDatails.setfReqTo_gender(user.getGender());
        friendsReqService.save();
        List<FriendsReq> freqList = friendsReqDao.getAll();
        model.addAllAttributes(freqList);
        System.out.println("From timelineController(save) to_user_full_name = " + freqList.get(0).getTo_full_name());

        return new ModelAndView("redirect:/user/newsFeed");
    }

    @RequestMapping(value = "/getAllReq", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView getAllReq(ModelMap model) {    // Using ModelAndView for processing view and data
        Map<String, Object> map = new HashMap<String, Object>();
        List<FriendsReq> freqList = friendsReqDao.getAllReq();
        map.put("freqList", freqList);
        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        return new ModelAndView("redirect:/user/newsFeed", "map", map);
    }

    @RequestMapping(value = "/getAllFriends", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView getAllFriends(ModelMap model) {    // Using ModelAndView for processing view and data
        Map<String, Object> map = new HashMap<String, Object>();
        List<FriendsReq> friendsList = friendsReqDao.getAllFriends();
        map.put("friendsList", friendsList);
        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        return new ModelAndView("redirect:/timeline/friendsPage", "map", map);
    }

    @RequestMapping(value = "/freq/update/{id}", method = RequestMethod.GET)
    public ModelAndView updateFreq(ModelMap map, @PathVariable("id") int id) {
        System.out.println("From TimelineController(update) .........");
        FriendsReq friendsReq = friendsReqService.updateById(id);
        return new ModelAndView("redirect:/timeline/friendsPage");
    }

    @RequestMapping(value = "/freq/cancel/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) { //Using @PathVariable by URL
        friendsReqDao.delete(id);
        return new ModelAndView("redirect:/timeline/friendsPage");
    }
    
    @RequestMapping(value = "/friendsAbout/{id}", method = RequestMethod.GET)
    public ModelAndView viewFriendsAbout(ModelMap model, @PathVariable("id") int id) {
        Map<String, Object> map = new HashMap<String, Object>();
        About about = aboutDao.getAboutByUserId(id);
        map.put("about", about);
        System.out.println("From TimelineController(getAbout) = " + about);
        return new ModelAndView("timeline/friendsAbout","map",map);
    }

}
