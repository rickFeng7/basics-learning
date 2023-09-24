package com.rick.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author fengrui
 */
@Controller
public class HelloController1 {

    @RequestMapping("/show")
    public ModelAndView show() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "这是第一个注解的springmvc程序");
        return mv;
    }
}
