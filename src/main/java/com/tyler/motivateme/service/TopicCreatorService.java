package com.tyler.motivateme.service;

import com.tyler.motivateme.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicCreatorService {

    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic(1, "Quit drinking"), new Topic(2, "Quit Smoking"), new Topic(3, "Eat healthier")));
    private String description;
    private String adviceAndStrategies;

    public List<Topic> allTopics() {

        return topics;
    }

    public void add(Topic topic) {
        topics.add(topic);
    }

    public void update(Topic topic) {}

    public void delete(Topic topic) { topics.remove(topic); }
}
