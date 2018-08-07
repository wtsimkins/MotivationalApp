package com.tyler.motivateme.service;

import com.tyler.motivateme.model.Topic;
import com.tyler.motivateme.repository.TopicRepository;
import org.apache.el.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainTopicsPageService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> allTopics() {
        List<Topic> allTopics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(allTopics::add);
        return allTopics;
    }

    public void getAllTopics(Integer id){
        topicRepository.findById(id);
    }

    public void add(Topic topic) {
        topicRepository.save(topic);
    }

    public void update(Topic newTopic) { topicRepository.save(newTopic);}

    public void delete(Integer id) { topicRepository.deleteById(id); }

}
