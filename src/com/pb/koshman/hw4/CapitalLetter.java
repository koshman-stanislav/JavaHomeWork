package com.pb.koshman.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args)
    {
        System.out.println("Введите строку");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        System.out.println(toUP(string));
    }
    public static String toUP(String string) {
        char[] result = string.toCharArray();
        if(Character.isAlphabetic(result[0]))result[0]=Character.toUpperCase(result[0]);
        String res=""+result[0];
        for(int i=1;i<result.length;i++)
        {
            if(Character.isAlphabetic(result[i]) && !Character.isAlphabetic(result[i-1]))result[i]=Character.toUpperCase(result[i]);
            res+=result[i];
        }
        return res;
    }
}
