package com.tyler.motivateme.controller;

import com.tyler.motivateme.MainTopicsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MainTopics")
public class MainTopicsPageController {
    @Autowired
    MainTopicsPage mainTopicsPage;
}
