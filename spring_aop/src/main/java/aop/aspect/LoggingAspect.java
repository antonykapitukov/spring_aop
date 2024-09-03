package aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("aop.aspect.AllPointcuts.beforeAllGetMethods()")
    public void beforeGetBookAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println(methodSignature);
        System.out.println(methodSignature.getMethod());
        System.out.println(methodSignature.getDeclaringType());
        System.out.println(methodSignature.getName());

        System.out.println("Before getBookAdvice: попытка получить книгу");
        System.out.println("------------------------------------------------------");
    }
}