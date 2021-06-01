package com.joshaustin.aspectexample.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class SimpleAdderReturnAspect {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleAdderReturnAspect.class);

    @Around("execution(* com.joshaustin.aspectexample.service..*(..))")
    public Object profileServiceMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable  {
        var methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        //Get intercepted method details
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        final var stopWatch = new StopWatch();

        //Measure method execution time
        stopWatch.start();
        Object result = proceedingJoinPoint.proceed();
        stopWatch.stop();

        //Log method execution time
        LOG.info("Execution time of " + className + "." + methodName + " "
                + ":: " + stopWatch.getTotalTimeMillis() + " ms");

        return result;
    }

    @AfterReturning(
            pointcut="execution(* com.joshaustin.aspectexample.service..*(..))",
            returning="returnValue"
    )
    public void getReturnValueOfServiceMethods(Object returnValue) throws Throwable {
        LOG.info("value return was {}",  returnValue);
    }
}
