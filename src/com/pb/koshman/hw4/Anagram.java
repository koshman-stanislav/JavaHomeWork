package com.pb.koshman.hw4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String s1 = scan.nextLine();
        System.out.println("Введите вторую строку");
        String s2 = scan.nextLine();
        System.out.println(s1);
        System.out.println(s2);
        String s1sort = sortString1(s1);
        String s2sort = sortString2(s2);
        if(s1sort.equalsIgnoreCase(s2sort) == true){
            System.out.println("Это аннограма");
        } else System.out.println("Это не аннограма");
    }
    public static String sortString1(String s1) {
        s1 = s1.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        char[] chArr1 = s1.toUpperCase().toCharArray();
        for (int i = chArr1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (chArr1[j] > chArr1[j + 1]) {
                    char tmp = chArr1[j];
                    chArr1[j] = chArr1[j + 1];
                    chArr1[j + 1] = tmp;
                }
            }
        }
        String string1 = String.valueOf(chArr1);
        string1 = string1.replaceAll(" ", "");
        System.out.println(string1);
        return string1;
    }
    public static String sortString2(String s2) {
       s2 = s2.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        char[] chArr2 = s2.toUpperCase().toCharArray();
        for (int i = chArr2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (chArr2[j] > chArr2[j + 1]) {
                    char tmp = chArr2[j];
                    chArr2[j] = chArr2[j + 1];
                    chArr2[j + 1] = tmp;
                }
            }
        }
        String string2 = String.valueOf(chArr2);
        string2 = string2.replaceAll(" ", "");
        System.out.println(string2);
        return string2;
    }
}


