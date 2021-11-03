package com.pb.koshman.hw5;


import java.lang.reflect.Array;

public class Library {
    public static void main(String[] args) {
        Book [] books = new Book[3];
        books[0] = new Book("Приключения","Иванов И. И.",2000);
        books[1] = new Book("Словарь","Сидоров А. В",1980);
        books[2] = new Book("Энциклопедия","Гусев К. В.",2010);

        for (int i = 0; i< books.length; i++){
            System.out.println(books[i].getInfo());
        }
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Иванов И.И.",12,"Биология",1956,"0996483984");
        readers[1] = new Reader("Петров П.П.",36,"Инженерия",1998,"0669586954");
        readers[2] = new Reader("Сидоров С.С.",15,"Филология",2002,"0569379992");

        for (int i = 0; i< readers.length; i++){
            System.out.println(readers[i].getInfo());
        }

        Reader reader1 = new Reader("Иванов И.И.", 12, "Биология", 1956, "0996483984");
        reader1.setFullName("Петров В.В.");
        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");

        reader1.returnBook(3);
        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
    }
}
