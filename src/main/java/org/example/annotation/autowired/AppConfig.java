package org.example.annotation.autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.annotation.autowired")
public class AppConfig {
}
