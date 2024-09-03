package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook() {
        System.out.println("Мы берем книгу");
        System.out.println("------------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал");
        System.out.println("------------------------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("------------------------------------------------------");
    }

    public String returnBook(){
        System.out.println("returnBook: вернули книгу");
        return "Война и мир";
    }

    public void addMagazine(String person_name, Book book){
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("------------------------------------------------------");
    }
}
