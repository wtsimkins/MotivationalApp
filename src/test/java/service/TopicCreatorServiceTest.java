package service;

import com.tyler.motivateme.model.Topic;
import com.tyler.motivateme.service.TopicCreatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class TopicCreatorServiceTest {

    TopicCreatorService tcs = new TopicCreatorService();


    @Test
    public void testAllTopics_AreInList(){
        List expected = new ArrayList<>(Arrays.asList());
        List actual = tcs.allTopics();
        assertEquals(expected, actual);
    }


    @Test
    public void testConstruction(){
        List<Topic> topics = tcs.allTopics();

        assertEquals(topics.size(), 0);
        assertTrue(topics.contains(0));
    }

    @Test
    public void testAddTopic_ToAllTopics(){
        Topic topic = new Topic();
        tcs.add(topic);

        List<Topic> topics = tcs.allTopics();

        assertTrue(topics.contains(topic));
    }

    @Test
    public void testUpdateTopic_InAllTopics(){
        int topicIndex = 2;
        Topic newTopic = new Topic();
        tcs.update(topicIndex, newTopic);

        List<Topic> topics = tcs.allTopics();

        assertTrue(topics.contains(newTopic));
    }

    @Test
    public void testDeleteTopic_FromAllTopics(){
        Topic topic = new Topic();
        tcs.delete(topic);

        List<Topic> topics = tcs.allTopics();

        assertFalse(topics.contains(topic));
    }
}
