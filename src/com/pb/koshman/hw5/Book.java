package com.pb.koshman.hw5;

public class Book {
    public static int getBookCount (){
        return bookCount;
    }
    static String name;
    static String author;
    static int yearPublish;
    static int bookCount = 0;

    public Book(){
    }
    public Book(String name, String author, int yearPublish){
            this.name = name;
            this.author = author;
            this.yearPublish = yearPublish;
            bookCount++;
    }

    String getInfo() {
        return "[Название: " + name + ", автор книги: " + author + ", год издания: "
                + yearPublish+ "]";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYearPublish() {
        return yearPublish;
    }
    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }
}
