package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.RoomApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { RoomApplication.class })
public class CucumberSpingConfiguration {}
