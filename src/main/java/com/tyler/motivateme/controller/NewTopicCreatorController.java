package com.tyler.motivateme.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewTopicCreatorController {

//    @Autowired
//    private NewTopicCreatorService newTopicCreatorService;
//
//    @RequestMapping(path="/topics")
//    public List<Topic> allTopics() {
//
//        return newTopicCreatorService.allTopics();
//    }

    @RequestMapping(value="/api/topics")
    public String what(){
        return "topic";
    }


}
