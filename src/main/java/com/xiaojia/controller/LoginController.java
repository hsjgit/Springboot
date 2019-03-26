package com.xiaojia.controller;

import com.xiaojia.business.DrugSalesVolume;
import com.xiaojia.service.ToJson;
import com.xiaojia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.PipedReader;
import java.util.List;
import java.util.Map;

/**
 * Created by 黄仕杰 on 2019/3/9.
 */
@RequestMapping("/user")
@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private DrugSalesVolume drugSalesVolume;
    @Autowired
    private ToJson toJson;
    @PostMapping("/login")
    public String login(String username, String password, HttpSession session,Map<String,Object> Map) {
        if (userService.selece(username, password)!=null) {
            String prcejson = toJson.json(drugSalesVolume.sigleDrugSales());
            String namejson = toJson.json(drugSalesVolume.getName());
            session.setAttribute("name", namejson);
            session.setAttribute("sales", prcejson);
            session.setAttribute("user", username);
            return "dashboard";
        }
        Map.put("msg", "用户密码错误");
        return "login";
    }

    @RequestMapping("/logout")
    public String hsj(HttpSession session) {
        session.setAttribute("user", null);
        return "login";
    }
}
