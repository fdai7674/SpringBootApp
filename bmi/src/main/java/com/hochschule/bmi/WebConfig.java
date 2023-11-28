package com.hochschule.bmi;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Adjust the path pattern to match your API endpoints
            .allowedOrigins("http://localhost:3000") // Specify the origins that are allowed to access your API
            .allowedMethods("GET", "POST", "PUT", "DELETE") // Specify the HTTP methods allowed
            .allowCredentials(true); // Allow credentials (e.g., cookies) to be included in the request
    }
}
