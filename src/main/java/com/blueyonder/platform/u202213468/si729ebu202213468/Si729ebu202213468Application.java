package com.blueyonder.platform.u202213468.si729ebu202213468;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //Habilita esto
public class Si729ebu202213468Application {

    public static void main(String[] args) {
        SpringApplication.run(Si729ebu202213468Application.class, args);
    }

}
