package com.f5knows.web.index.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author huangyaohui
 * @Date 2019/3/7
 */
@RestController
@RequestMapping("")
public class IndexController {


    @GetMapping("")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
