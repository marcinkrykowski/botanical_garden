package com.upr.botanicalGarden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.upr.botanicalGarden.*"})
public class BotanicalGardenApplication {

    public static void main(String[] args) {
        SpringApplication.run(BotanicalGardenApplication.class, args);
    }

}
