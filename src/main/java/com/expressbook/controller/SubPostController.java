package com.expressbook.controller;

import com.expressbook.dao.PostDao;
import com.expressbook.dao.SubPostDao;
import com.expressbook.model.LoggedUserDetails;
import com.expressbook.model.Post;
import com.expressbook.service.SubPostService;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/subPost")
public class SubPostController {

    @Autowired
    SubPostService subPostService;

    @Autowired
    SubPostDao subPostDao;

    @Autowired
    PostDao postDao;

    @Autowired
    LoggedUserDetails loggedUserDetails;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView comment(HttpServletRequest request) throws Exception {
        subPostService.save(request);
        return new ModelAndView("redirect:/post/allPost");
    }

    @RequestMapping(value = "/getPostById", method = RequestMethod.GET)
    public ModelAndView getPostById(ModelMap map, @RequestParam("id") Integer id) {
        Post post = postDao.getById(id);

        loggedUserDetails.setGetPost_user_user_id(post.getUser().getUser_id());
        loggedUserDetails.setGetPost_user_full_name(post.getUser().getFull_name());
        loggedUserDetails.setGetPost_user_surname(post.getUser().getSurname());
        loggedUserDetails.setGetPost_user_mob_email(post.getUser().getMob_email());
        loggedUserDetails.setGetPost_user_pass(post.getUser().getPass());
        loggedUserDetails.setGetPost_user_dob(post.getUser().getDob());
        loggedUserDetails.setGetPost_user_gender(post.getUser().getGender());
        
        loggedUserDetails.setGetPostByIdPost_id(post.getPost_id());
        System.out.println("...............From SubPostController(getPostById) post id = "+loggedUserDetails.getGetPostByIdPost_id());
        loggedUserDetails.setGetPostByIdDescription(post.getDescription());
        loggedUserDetails.setGetPostByIdImg(post.getImg());
        loggedUserDetails.setGetPostByIdPostOrupdate_date(post.getPostOrupdate_date());
        Map<String, Object> map2 = new HashMap<String, Object>();
        return new ModelAndView("redirect:/post/allPost", "mapSubpostList", map2);
    }

    @RequestMapping(value = "/getAllSubpostById", method = RequestMethod.GET)
    public ModelAndView getSubpostById(ModelMap model, @RequestParam("id") Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("getAllSubPostById ..............methd ...........is .............working");
        return new ModelAndView("redirect:/post/allPost", "map", map);
    }

}
