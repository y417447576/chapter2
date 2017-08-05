package com.smart.web;

import com.smart.domain.User;
import com.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/30/030.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

//        负责处理/index.html的请求
    @RequestMapping(value = "/index.html")
    public String loginPage () {
        return "login";
    }

    public UserService getUserService() {
        return userService;
    }

    //处理loginCheck.html的请求
    @RequestMapping(value = "/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest requst, LoginCommand loginCommand) {
        boolean isValidUser = userService.hasMatchUser(loginCommand.getUserName(), loginCommand.getPassword());
        if (!isValidUser) {
            return new ModelAndView("login", "error", "用户名或密码错误。");
        } else {
            User user = userService.findUserByUserName(loginCommand.getUserName());
            user.setLastIp(requst.getLocalAddr());
            user.setLastVisit(new Date());
            userService.loginSucess(user);
            requst.getSession().setAttribute("user", user);
            return new ModelAndView("main");
        }
    }
}
