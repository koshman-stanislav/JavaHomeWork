package com.pb.koshman.hw5;

import com.sun.istack.internal.NotNull;

public class Reader {
    public String fullName;
    int libraryCardNumber;
    String faculty;
    int dateBirth;
    String phoneNumber;
    private Book[] books;

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }
    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public int getDateBirth() {
        return dateBirth;
    }
    public void setDateBirth(int dateBirth) {
        this.dateBirth = dateBirth;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Reader(String fullName){
        this.fullName = fullName;
    }

    public Reader(String fullName, int libraryCardNumber, String faculty, int dateBirth, String phoneNumber){
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
    }
    String getInfo () {
        return "[ФИО: " + fullName + ", номер читательского билета: " + libraryCardNumber + ", факультет: "
                + faculty + ", дата рождения: " + dateBirth +", телефон: " + phoneNumber + "]";
    }

    public void takeBook(int numberBooks) {
        System.out.println(fullName + " взял " + numberBooks + " книги" );
    }

    public void takeBook(String ... titles) {
        System.out.println(fullName + " взял: ");
        for (String name: titles)
            System.out.println(name);
    }

    public void takeBook(Book ... book) {

        StringBuilder notifyBookObjectTaken = new StringBuilder();
        notifyBookObjectTaken.append(fullName).append(" взял книнги: ");

        for (int i = 0; i < book.length; i++) {
            notifyBookObjectTaken.append(book[i].getName()).append(" (").append(book[i].getAuthor()).append(" ")
                    .append(book[i].getYearPublish()).append(" г.)");

            if (i < book.length - 1) {
                notifyBookObjectTaken.append(", ");
            } else {
                notifyBookObjectTaken.append(".");
            }
        }

        System.out.println(notifyBookObjectTaken);

    }

    public void returnBook(int numberBooks) {
        System.out.println(fullName + " вернул: " + numberBooks + " книг" );
    }

    public void returnBook(String...titles) {
        System.out.println(fullName + " вернул: " );
        for (String name: titles)
            System.out.println(name);
    }

    public void returnBook(Book ... book) {

        StringBuilder notifyBookObjectReturned = new StringBuilder();
        notifyBookObjectReturned.append(fullName).append(" вернул книнги: ");

        for (int i = 0; i < book.length; i++) {
            notifyBookObjectReturned.append(book[i].getName()).append(" (").append(book[i].getAuthor())
                    .append(" ").append(book[i].getYearPublish()).append(" г.)");

            if (i < book.length - 1) {
                notifyBookObjectReturned.append(", ");
            } else {
                notifyBookObjectReturned.append(".");
            }
        }

        System.out.println(notifyBookObjectReturned);

    }
}
