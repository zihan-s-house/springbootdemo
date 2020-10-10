package com.etc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Index {

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        mv.addObject("uname","囍");
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("Jackson");
        list.add("Yee");
        list.add("囍");
        mv.addObject("list",list);
        return mv;
    }
}
