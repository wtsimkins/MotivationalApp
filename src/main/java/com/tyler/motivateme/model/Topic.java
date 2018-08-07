package com.tyler.motivateme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private String adviceAndStrategies;


    public Topic(int id, String name, String description, String adviceAndStrategies) {
        this.id = id;
        this.name = name;
        this.description = description;

        this.adviceAndStrategies = adviceAndStrategies;
    }

    public Topic(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getAdviceAndStrategies() { return adviceAndStrategies; }

    public void setAdviceAndStrategies(String adviceAndStrategies) { this.adviceAndStrategies = adviceAndStrategies; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return id == topic.id &&
                Objects.equals(name, topic.name) &&
                Objects.equals(description, topic.description) &&
                Objects.equals(adviceAndStrategies, topic.adviceAndStrategies);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, description, adviceAndStrategies);
    }
}
