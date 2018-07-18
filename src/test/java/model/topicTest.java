package model;

import com.tyler.motivateme.model.Topic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class topicTest {

    Topic topic = new Topic();

    @Test
    public void testGetDescription() {
        String expected = "This is a description of the topic";
        topic.setDescription(expected);
        String actual = topic.getDescription();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAdviceAndStrategies() {
        String expected = "This is the advice and strategies section of the topic";
        topic.setAdviceAndStrategies(expected);
        String actual = topic.getAdviceAndStrategies();
        assertEquals(expected, actual);
    }
}
