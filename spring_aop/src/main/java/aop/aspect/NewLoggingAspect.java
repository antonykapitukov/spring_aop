package aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookAdvice: В библиотеку пытаются вернуть книгу.");

        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("aroundReturnBookAdvice: В библиотеку успешно вернули книгу.");
        return targetMethodResult;
    }
}
