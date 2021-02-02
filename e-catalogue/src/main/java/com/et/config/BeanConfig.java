package com.et.config;

import com.et.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Anuj Sharma
 **/
    @Configuration
    public class BeanConfig {

        @Bean
        public UserService userService() {
            return new UserService();
        }

}
