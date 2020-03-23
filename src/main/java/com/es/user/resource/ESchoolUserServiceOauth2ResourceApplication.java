package com.es.user.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
@EntityScan(basePackages = {"com.es.user.resource.entity"})
@EnableJpaRepositories(basePackages = {"com.es.user.resource.repository",})
@EnableJpaAuditing
@EnableOAuth2Client  // 启用 OAuth 2.0 客户端
@EnableDiscoveryClient
public class ESchoolUserServiceOauth2ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ESchoolUserServiceOauth2ResourceApplication.class, args);
    }

}
