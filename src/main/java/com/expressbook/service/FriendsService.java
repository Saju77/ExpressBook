package com.expressbook.service;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Repository;

@Repository
public class FriendsService {
    
    public void save(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();

        
        
    }
}
