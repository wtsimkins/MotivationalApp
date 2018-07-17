package com.tyler.motivateme.controller;

import com.tyler.motivateme.model.TopicCreatorService;
import com.tyler.motivateme.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicCreatorController {

    @Autowired
    private TopicCreatorService topicCreatorService;

    public List<Topic> allTopics() {

        return topicCreatorService.allTopics();
    }

}
