package com.pb.koshman.hw5;

public class Reader {
    String fullName;
    int libraryCardNumber;
    String faculty;
    int dateBirth;
    String phoneNumber;

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

    public void takeBook(String fullName){
        System.out.println(fullName + "взял 3 книги");
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

}
