package com.xtj.controller;

import com.sun.deploy.net.HttpResponse;
import com.xtj.model.User;
import com.xtj.service.impl.IUserService;
import org.apache.ibatis.jdbc.Null;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;

import java.util.ArrayList;
import java.util.List;



@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("uService2")
    private IUserService userService;

    @RequestMapping("/select")
    public ModelAndView selected() {

        ModelAndView modelAndView = new ModelAndView();
        try {
            List<Integer> d =new   ArrayList<Integer>();
            d.add(1);
            
          /*  User user = userService.selectUser(1);
            modelAndView.addObject("user", user);*/

            User user = new User();
            user.setEmail("5496465@163.com");
            user.setMobile("15815423568");
            user.setRole("经理");
            user.setUsername("华晨宇");
            userService.Adduser(user);

            //List<User> userList = userService.findUser();

            List<User> userList2 = userService.FindByName("华晨");

            User user1 = userService.selectUser(4);
            user1.setUsername("刘德华");
            userService.Upuser(user1);
            userService.Deluser((int) user1.getId());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        modelAndView.setViewName("user");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/select2")
    public Object selectedq(){

        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setEmail("5496465@163.com");
        user.setMobile("15815423568");
        user.setRole("经理");
        user.setUsername("华晨宇");

        modelAndView.setViewName("user");
        return modelAndView;
    }




  /*  @RequestMapping("/equest")
    public  String getRequestAndReapons(HttpRequest  request, HttpResponse response){
        HttpRequest  request1=request;

        HttpResponse  httpResponse=response;

        return "";
    }*/
}
