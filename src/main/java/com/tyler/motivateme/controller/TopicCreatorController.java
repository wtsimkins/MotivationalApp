package com.tyler.motivateme.controller;

import com.tyler.motivateme.service.TopicCreatorService;
import com.tyler.motivateme.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicCreatorController {

    @Autowired
    private TopicCreatorService topicCreatorService;

    @RequestMapping(method = RequestMethod.GET, value = "/CreateTopic")
    public List<Topic> allTopics() {

        return topicCreatorService.allTopics();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/CreateTopic")
    public void add(Topic topic){
        topicCreatorService.add(topic); }

    @RequestMapping(method = RequestMethod.PUT, value = "/CreateTopic/{id}")
    public void update(Topic topic){
        topicCreatorService.update(topic); }

    @RequestMapping(method = RequestMethod.DELETE, value = "/CreateTopic/{id}")
    public void delete(Topic topic){
        topicCreatorService.delete(topic); }



}
