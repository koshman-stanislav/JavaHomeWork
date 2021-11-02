package com.pb.koshman.hw5;


public class Library {
    public static void main(String[] args) {
        Book [] books = new Book[3];
        books[0] = new Book("1000 и одна ночь","Шарипов",1659);
        books[1] = new Book("JS для чайников","Данилов",2015);
        books[2] = new Book("Сумашелшие в Мексике","Кидрук",2009);

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

    }
}
