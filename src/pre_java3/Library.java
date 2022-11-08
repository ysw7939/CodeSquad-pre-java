package pre_java3;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> A = new ArrayList<>();
        ArrayList<Book> A_1;
        ArrayList<Book> B = new ArrayList<>();

        A.add(new Book("태백산맥", "조정래"));
        A.add(new Book("이기적 유전자", "리처드 도킨즈"));
        A.add(new Book("자전거 도둑", "박완서"));
        A.add(new Book("토지", "박경리"));
        A.add(new Book("대변동", "제레드 다이아몬드"));

        A_1 = A;
        B.addAll(A);

        A.set(2, new Book("그 많던 싱아는 누가 다 먹었을까", "박완서"));
        B.add(new Book("사피엔스", "유발 하라리"));

        for (Book book : A) book.showBookInfo();
        System.out.println("\n");

        for (Book book : A_1) book.showBookInfo();
        System.out.println("\n");

        for (Book book : B) book.showBookInfo();
        System.out.println("\n");
    }
}
