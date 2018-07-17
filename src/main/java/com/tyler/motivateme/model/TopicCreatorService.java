package com.tyler.motivateme.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicCreatorService {

    private List<Topic> topics;
    private String description;
    private String adviceAndStrategies;

    public TopicCreatorService(){
        this.topics = topics = new ArrayList<Topic>(Arrays.asList(new Topic(1, "Quit drinking"), new Topic(2, "Quit Smoking"), new Topic(3, "Eat healthier")));
        this.description = description;
        this.adviceAndStrategies = adviceAndStrategies;
    }

    public List<Topic> allTopics() {

        return topics;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdviceAndStrategies(String adviceAndStrategies) {
        this.adviceAndStrategies = adviceAndStrategies;
    }

    public String getDescription() {

        return description;
    }

    public String getAdviceAndStrategies() {
        return adviceAndStrategies;
    }

    public void add(Topic topic) {
        topics.add(topic);
    }
}
