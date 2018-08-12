package com.tyler.motivateme.service;

import org.springframework.stereotype.Service;

@Service
public class TopicInfoPageService {

    private String topicName;
    private String description;
    private String adviceAndStrategies;

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdviceAndStrategies(String adviceAndStrategies) {
        this.adviceAndStrategies = adviceAndStrategies;
    }

    public String getTopicName() { return topicName;}

    public String getDescription() { return description;

    }

    public String getAdviceAndStrategies() {
        return adviceAndStrategies;

    }

    public void updateDescription(){ }

    public void updateAdviceAndStrategies(){}
}
