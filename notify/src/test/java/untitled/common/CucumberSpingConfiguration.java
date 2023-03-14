package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.NotifyApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotifyApplication.class })
public class CucumberSpingConfiguration {}
