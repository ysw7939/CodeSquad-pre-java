package pre_java3;

public class Book {
    String writer;
    String title;

    public Book(String title, String writer){
        this.title = title;
        this.writer = writer;
    }

    public void showBookInfo() {
        System.out.println(title + " | 저자 :" + writer);
    }


}
