package com.expressbook.service;

import com.expressbook.dao.UserDao;
import com.expressbook.model.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserDao userDao;

    public void userRegister(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();

        String full_name = map.get("full_name")[0];
        String surname = map.get("surname")[0];
        String mob_email = map.get("mob_email")[0];
        String password = map.get("password")[0];
        Date dateObject = new Date();
        String fronEndDateString = map.get("dob")[0];
        String gender = map.get("gender")[0];

        User user = new User();
        user.setFull_name(full_name);
        user.setSurname(surname);
        user.setMob_email(mob_email);
        user.setPass(password);
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateObject = simpleDate.parse(fronEndDateString);
        } catch (ParseException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        user.setDob(dateObject);
        user.setGender(gender);
        userDao.userRegister(user);
    }
    
    public boolean userLogin(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();

        String mob_email = map.get("mob_email")[0];
        String password = map.get("password")[0];
        
        User user = new User();
        user.setMob_email(mob_email);
        user.setPass(password);

        User u = userDao.userLogin(user);

        if (mob_email.equals(u.getMob_email()) && password.equals(u.getPass())) {
            return true;
        } else {
            return false;
        }
    }
    
    public User LoggedUser(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();

        String mob_email = map.get("mob_email")[0];
        User user = new User();
        user.setMob_email(mob_email);
        
        User u = userDao.getByMob_email(mob_email);

        return u;
    }
    
}
