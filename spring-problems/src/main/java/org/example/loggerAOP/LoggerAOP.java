package org.example.loggerAOP;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
import java.lang.annotation.*;
import java.util.*;

@Aspect
@Component
public class LoggerAOP {
    @Autowired private Logger logger;

    @Before("withLogExecution() && publicMethod()")
    public void loggingAdvice(JoinPoint joinPoint) {
        logger.log(joinPoint.getSignature().getName());
    }

    @Pointcut("execution(public * *(..))")
    public void publicMethod() {}

    @Pointcut("@annotation(LogExecution)")
    public void withLogExecution() {}

    public static void main(String[] args) {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext();
        config.register(Config.class);
        config.refresh();

        NameRepository repository = config.getBean(NameRepository.class);
        repository.getNames();
    }
}

