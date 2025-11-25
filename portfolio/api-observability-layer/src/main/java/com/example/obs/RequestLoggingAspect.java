package com.example.obs;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Aspect
@Component
public class RequestLoggingAspect {

    @Before("within(@org.springframework.web.bind.annotation.RestController *)")
    public void before(JoinPoint jp) {
        String traceId = UUID.randomUUID().toString();
        MDC.put("traceId", traceId);
    }

    @AfterReturning("within(@org.springframework.web.bind.annotation.RestController *)")
    public void after(JoinPoint jp) {
        MDC.remove("traceId");
    }
}