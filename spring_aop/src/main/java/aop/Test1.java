package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Library library = context.getBean("libraryBean", Library.class);
        Book book = context.getBean("bookBean", Book.class);
        library.addBook("Anton", book);
        context.close();
    }
}
