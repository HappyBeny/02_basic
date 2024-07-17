package practice.constructEx;

public class Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    //TODO 코드를 완성하세요.
    Book(){
        this("미상","미상",0);
    }

    Book(String title, String author){
        this(title,author,0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo(){
        System.out.println("제목 : " + this.title + ", 저자 : " + this.author + ", 페이지 : " + this.page);
    }
}
