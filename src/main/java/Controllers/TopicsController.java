package Controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public interface TopicsController {

    public String getDescription();
    public String getAdviceAndStrategies();

}
