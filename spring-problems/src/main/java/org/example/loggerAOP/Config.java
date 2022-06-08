package org.example.loggerAOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAspectJAutoProxy
@Import({LoggerAOP.class, NameRepository.class})
class Config {
    @Bean
    public Logger logger() {
        return (message) -> System.out.println(message);
    }
}
