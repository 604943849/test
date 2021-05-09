package com.l.teacher;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author L
 * @date 2021/05/01
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.l.teacher.mapper")
public class TeacherApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeacherApplication.class,args);
    }
}
