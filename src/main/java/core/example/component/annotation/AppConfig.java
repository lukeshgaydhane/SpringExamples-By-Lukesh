package core.example.component.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "core.example.component.annotation")
public class AppConfig {
}
