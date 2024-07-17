package construct;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this("","",0);
    }

    Book(String title, String author){
        this(title, author, 0);
    }

    Book(String title, String author, int page) {//이거 왜 오류남? 제목에 질문 다니까 왜 안남???
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목 : " + title + ", 저자 : " + author + ",페이지 : " + page);
    }
}
