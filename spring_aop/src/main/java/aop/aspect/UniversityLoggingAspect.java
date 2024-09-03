package aop.aspect;


import aop.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execute(* getStrudent())")
    public void beforeGetStrudent() {
        System.out.println("Before getStrudent()");
    }

    @AfterReturning(pointcut = "execute(* getStrudent())", returning = "student")
    public void afterReturningGetStrudent(List<Student> students) {
        System.out.println("AfterReturning getStrudent()");
    }
}
