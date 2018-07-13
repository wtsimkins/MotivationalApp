package com.tyler.motivateme.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NewTopicCreatorService {

    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic(1, "Quit drinking"), new Topic(2, "Quit Smoking"), new Topic(3, "Eat healthier")));

    public List<Topic> allTopics() {

        return topics;
    }
}
