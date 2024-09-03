package aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class AllPointcuts {
    @Pointcut("execution(* add*(..))")
    public void beforeAllGetMethods() {}
}
