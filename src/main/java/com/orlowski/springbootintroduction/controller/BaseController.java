package com.orlowski.springbootintroduction.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    Logger logger = LoggerFactory.getLogger(BaseController.class);

    @RequestMapping(value = "/my/custom/path/summary", method = RequestMethod.GET)
    String getSomeSummary() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "some_random_text";
    }
}
