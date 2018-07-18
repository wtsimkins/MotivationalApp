package com.tyler.motivateme.service;

import com.tyler.motivateme.model.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainTopicsPageService {
    List<Topic> topics;

    public MainTopicsPageService(){
        this.topics = new ArrayList<>();
    }

    public List<Topic> allTopics() {

        return topics;
    }

}
