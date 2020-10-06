package com.expressbook.controller;

import com.expressbook.dao.AdminDao;
import com.expressbook.model.Audit;
import com.expressbook.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    
    @Autowired
    AdminDao adminDao;

    @RequestMapping(value = "/adminPage")
    public String welcomePage() {
        System.out.println("Hit by Admin Page");
        return "admin/adminPage";
    }
    
    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
    public ModelAndView adminLogin(ModelMap model,HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        System.out.println("Hit by Admin Page");
        if (map.get("mob_email")[0].equals("Admin") && map.get("password")[0].equals("admin")) {
            return new ModelAndView("redirect:/admin/viewUser");
        } else {
            return new ModelAndView("user/404ErrorPage");
        }
    }

    @RequestMapping(value = "/viewUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView viewUser() {    // Using ModelAndView for processing view and data
        Map<String, Object> map = new HashMap<String, Object>();
        List<User> userList = adminDao.getAllUser();
        map.put("userList", userList);
        return new ModelAndView("admin/user", "map", map);
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) { //Using @PathVariable by URL
        adminDao.delete(id);
        return new ModelAndView("redirect:/admin/viewUser");  // Redirect to a Handler Mapping after an action
    }
    
    @RequestMapping(value = "/viewAudit", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView viewAudit() {    // Using ModelAndView for processing view and data
        Map<String, Object> map = new HashMap<String, Object>();
        List<Audit> auditList = adminDao.getAllAudit();
        map.put("auditList", auditList);
        return new ModelAndView("admin/audit", "map", map);
    }
    
}
