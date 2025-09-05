package com.example.SpringRESTdemo2.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {


    public static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);



    @Before("execution (* com.example.SpringRESTdemo2.service.JobService.*(..))")
    public void logMethodCall() {
        LOGGER.info("Method Called in logger aspect");
    }


}
