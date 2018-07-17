package model;

import com.tyler.motivateme.model.Topic;
import com.tyler.motivateme.model.TopicCreatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class TopicCreatorServiceTest {

    TopicCreatorService tcs = new TopicCreatorService();

    @Test
    public void testGetDescription() {
        String expected = "This is a description of the topic";
        tcs.setDescription(expected);
        String actual = tcs.getDescription();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAdviceAndStrategies() {
        String expected = "This is the advice and strategies section of the topic";
        tcs.setAdviceAndStrategies(expected);
        String actual = tcs.getAdviceAndStrategies();
        assertEquals(expected, actual);
    }

    @Test
    public void testAllTopics_AreInList(){
        List expected = new ArrayList<>(Arrays.asList(new Topic(1, "Quit drinking"), new Topic(2, "Quit Smoking"), new Topic(3, "Eat healthier")));
        List actual = tcs.allTopics();
        assertEquals(expected, actual);
    }


    @Test
    public void testConstruction(){
        List<Topic> topics = tcs.allTopics();

        assertEquals(topics.size(), 3);
        assertTrue(topics.contains(new Topic(1, "Quit drinking")));
    }

    @Test
    public void testAddTopics_toAllTopics(){
        Topic topic = new Topic(4, "working out");
        tcs.add(topic);

        List<Topic> topics = tcs.allTopics();

        assertTrue(topics.contains(topic));
    }
}
