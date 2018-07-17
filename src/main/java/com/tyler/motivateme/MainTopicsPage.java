package com.tyler.motivateme;

import com.tyler.motivateme.model.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainTopicsPage {
    List<Topic> topicsList;

    public MainTopicsPage(){
        this.topicsList = new ArrayList<>();
    }


}
