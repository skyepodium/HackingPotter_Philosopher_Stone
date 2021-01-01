package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "/house_hat", method = RequestMethod.GET)
    public String houseHat() {
        return "/house_hat/index.html";
    }

    @RequestMapping(value = "/snitch1", method = RequestMethod.GET)
    public String snitch1() {
        return "/snitch1/index.html";
    }

    @RequestMapping(value = "/snitch2", method = RequestMethod.GET)
    public String snitch2() {
        return "/snitch2/index.html";
    }
}
