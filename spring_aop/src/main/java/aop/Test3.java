package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Library library = context.getBean("libraryBean", Library.class);
        String bookName = library.returnBook();

        context.close();
        System.out.println("Method main ends");
    }
}
