package com.tyler.motivateme.controller;

import com.tyler.motivateme.model.Topic;
import com.tyler.motivateme.service.MainTopicsPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainTopicsPageController {
    @Autowired
    MainTopicsPageService mainTopicsPageService;

    @RequestMapping(method = RequestMethod.GET, value = "/topics")
    public List<Topic> allTopics() {

        return mainTopicsPageService.allTopics();
    }
}
