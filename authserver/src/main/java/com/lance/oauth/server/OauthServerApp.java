package com.lance.oauth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableResourceServer
public class OauthServerApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(OauthServerApp.class, args);
    }
}
