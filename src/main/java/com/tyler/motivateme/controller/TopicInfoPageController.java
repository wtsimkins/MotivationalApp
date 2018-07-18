package com.tyler.motivateme.controller;

import com.tyler.motivateme.service.TopicInfoPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicInfoPageController {

    @Autowired
    private TopicInfoPageService topicInfoPageService;

    public void getTopicName() {}

    public void getDescription() {

    }

    public void getAdviceAndStrategies() {

    }

}
