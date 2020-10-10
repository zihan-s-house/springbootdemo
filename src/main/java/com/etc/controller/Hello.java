package com.etc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Jackson Yee!";
    }
    @RequestMapping("/hello2")
    public String hello2(){
        return "Hello Jackson  囍囍囍!";
    }
    @RequestMapping("/hello3")
    public String hello3(){
        return "Hello Jackson  囍囍囍，哈哈哈，o(*￣︶￣*)o!";
    }
    @RequestMapping("/hello4")
    public String hello4(){
        return "Hello Jackson  囍o(*￣︶￣*)o!囍";
    }
    @RequestMapping("/hello5")
    public String hello5(){
        return "囍o(*￣︶￣*)o!囍";
    }
    @RequestMapping("/hello6")
    public String hello6(){
        return "o(*￣︶￣*)o!";
    }
    @RequestMapping("/hello7")
    public String hello7(){
        return "o(*￣︶￣*)o!7";
    }


}
