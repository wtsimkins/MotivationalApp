package com.tyler.motivateme.controller;

import com.tyler.motivateme.MainTopicsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TopicInfo")
public class TopicInfoPageController {

    @Autowired
    private MainTopicsPage mainTopicsPage;

    public String getDescription() {return null;}
    public String getAdviceAndStrategies() {return null;}

}
