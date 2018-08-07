package com.tyler.motivateme.service;

import com.tyler.motivateme.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicCreatorService {

    private List<Topic> topics = new ArrayList<>();
    private String description;
    private String adviceAndStrategies;

    public List<Topic> allTopics() {

        return topics;
    }

    public void add(Topic topic) {
        topics.add(topic);
    }

    public void update(int topicIndex, Topic newTopic) { topics.set(topicIndex, newTopic);}

    public void delete(Topic topic) { topics.remove(topic); }
}
