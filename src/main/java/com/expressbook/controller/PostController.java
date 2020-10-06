package com.expressbook.controller;

import com.expressbook.dao.PostDao;
import com.expressbook.dao.SubPostDao;
import com.expressbook.model.LoggedUserDetails;
import com.expressbook.model.Post;
import com.expressbook.model.Subpost;
import com.expressbook.service.PostService;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/post")
public class PostController {

    @Autowired
    PostDao postDao;

    @Autowired
    PostService postService;

    @Autowired
    LoggedUserDetails loggedUserDetails;

    @Autowired
    SubPostDao subPostDao;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView post(HttpServletRequest request,
            @RequestParam CommonsMultipartFile[] fileUpload) throws Exception {

        if (fileUpload != null && fileUpload.length > 0) {
            for (CommonsMultipartFile aFile : fileUpload) {
                System.out.println("Saving file: " + aFile.getOriginalFilename());
                postService.save(request, fileUpload);
            }
        }
        return new ModelAndView("redirect:/user/newsFeed");
    }

    @RequestMapping(value = "/imageDisplay", method = RequestMethod.GET)
    public void showImage(@RequestParam("id") Integer Id, HttpServletResponse response, HttpServletRequest request)
            throws ServletException, IOException {
        Post post = postDao.getById(Id);
        response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        response.getOutputStream().write(post.getImg());
        response.getOutputStream().close();
    }

    @Autowired
    SessionFactory sessionFactory;
    
    @RequestMapping(value = "/allPost", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView viewPost(ModelMap model) {    // Using ModelAndView for processing view and data
        Map<String, Object> map = new HashMap<String, Object>();
        List<Post> postList = postDao.getAll();
        map.put("postList", postList);
        System.out.println("From PostController(allPost) PostList = " + postList);
        List<Subpost> subpostList = subPostDao.getAll();
        map.put("subpostList", subpostList);
        String LoggedUsername = loggedUserDetails.getFull_name();
        model.put("LoggedUsername", LoggedUsername);
        return new ModelAndView("redirect:/user/newsFeed", "map", map);
    }

}
