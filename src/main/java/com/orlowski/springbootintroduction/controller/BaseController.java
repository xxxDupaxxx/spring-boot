package com.orlowski.springbootintroduction.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping(value = "/my/custom/path/summary", method = RequestMethod.GET)
    String getSomeSummary() {
        return "some_random_text";
    }
}
