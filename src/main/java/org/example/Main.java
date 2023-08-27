package org.example;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        Author2 author2 = new Author2();
//        Author3 author3 = new Author3();
        Author4 author4 = new Author4("Stephen", "King", "An American author of horror");
        Author5 author5 = new Author5("Stephen", "King");
        Author6 author6 = Author6.builder()
                .firstName("Stephen")
                .lastName("King")
                .biography("An American author of horror")
                .build();
        Author7 author7 = new Author7();
        Author8 author8 = new Author8();

        System.out.println(author1);
        System.out.println(author2);
//        System.out.println(author3);
        System.out.println(author4);
        System.out.println(author5);
        System.out.println(author6);
        System.out.println(author7);
        System.out.println(author8);
    }
}