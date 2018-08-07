package com.tyler.motivateme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TopicMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String user_id;
    private String topic_id;
    private int date;
}
