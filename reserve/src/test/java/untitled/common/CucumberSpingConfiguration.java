package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.ReserveApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ReserveApplication.class })
public class CucumberSpingConfiguration {}
