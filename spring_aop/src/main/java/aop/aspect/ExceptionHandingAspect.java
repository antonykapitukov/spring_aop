package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandingAspect {
    @Before("aop.aspect.AllPointcuts.beforeAllGetMethods()")
    public void beforeGetBookAdvice() {
        System.out.println("Before getBookAdvice: отлавливаем исключение");
        System.out.println("------------------------------------------------------");
    }
}
