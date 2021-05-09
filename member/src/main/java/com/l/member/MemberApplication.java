package com.l.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author L
 * @date 2021/05/01
 */
@SpringBootApplication
@EnableHystrixDashboard //启动熔断器监控系统
@EnableCircuitBreaker //启用熔断器功能
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.l.member.mapper")
public class MemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class);
    }
}
