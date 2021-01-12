package com.luomu.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PersonAspect {
    private Logger logger = LoggerFactory.getLogger(PersonAspect.class);

    @Pointcut("@annotation(PersonAnnotation)")
    public void pointCut() {
    }

    @Around("pointCut()")
    public void around(JoinPoint joinPoint) {
        System.out.println(joinPoint);
    }
}
