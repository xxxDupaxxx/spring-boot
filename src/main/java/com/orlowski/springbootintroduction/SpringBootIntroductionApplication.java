package com.orlowski.springbootintroduction;

import com.orlowski.springbootintroduction.configuration.MyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({MyConfiguration.class})
public class SpringBootIntroductionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootIntroductionApplication.class, args);
    }
}
