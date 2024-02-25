package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
;


@SpringBootApplication()
@EnableAspectJAutoProxy
public class GraduateApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraduateApplication.class, args);
    }

}
