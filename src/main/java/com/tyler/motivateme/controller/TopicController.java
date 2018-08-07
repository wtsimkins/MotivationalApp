package com.tyler.motivateme.controller;

import com.tyler.motivateme.repository.TopicRepository;
import com.tyler.motivateme.service.TopicCreatorService;
import com.tyler.motivateme.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TopicController {

//    @Autowired
//    private TopicCreatorService topicCreatorService;

    @Autowired
    private TopicRepository topicRepository;

    @RequestMapping(method = RequestMethod.GET, value="/topics")
    public Iterable<Topic> allTopics() {
        return topicRepository.findAll();
    }



//    @RequestMapping(method = RequestMethod.GET, value = "/CreateTopic")
//    public List<Topic> allTopics() {
//
//        return topicCreatorService.allTopics();
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/CreateTopic")
//    public void add(Topic topic){
//        topicCreatorService.add(topic); }
//
//    @RequestMapping(method = RequestMethod.PUT, value = "/CreateTopic/{id}")
//    public void update(int topicIndex, Topic newTopic){
//        topicCreatorService.update(topicIndex, newTopic); }
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "/CreateTopic/{id}")
//    public void delete(Topic topic){
//        topicCreatorService.delete(topic); }



}
