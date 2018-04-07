package com.dabaizi.mi.controller;


import com.dabaizi.mi.domain.User;
import com.dabaizi.mi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RequestMapping("/")
@Controller
public class MiController {

    @Resource
    private UserService userService;

    @RequestMapping("hello")
    @ResponseBody
    public ModelAndView hello() {
        User user = userService.getUserById(1L);
        String str1 = user.getUserName() + " " + user.getMobilePhone();
        System.out.println("SUCCESS");
        System.out.println("hello world!");
        System.out.println(str1);
        ModelAndView mav = new ModelAndView();
        mav.addObject("str1",str1);
        return mav;
    }

}
