package com.pb.koshman.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int x  = (int) (Math.random() * 100);
        System.out.println("x = " + x); // для проверки
        System.out.println("Угадайте задуманое число от 0 до 100. Для выхода из программы введите число 101. Введите число:");
        Scanner scan = new Scanner(System.in);
        for (; ; ){
            int y = scan.nextInt();
            final int MAX_ATTEMPT = 100;
            int attempt = 0;
            Scanner in = new Scanner(System.in);
            attempt++;
            System.out.println("попытка" + attempt + ":" );
            while (attempt<MAX_ATTEMPT) {
                attempt++;
                if (y > x && y!= 101) {
                    System.out.println("Введите число помешьше");
                }
                if (y < x) {
                    System.out.println("Введите число побольше");
                }
                if (y == x) {
                    System.out.println("Вы угадали с  " + attempt + "попытки");
                    break;
                }
                if (y == 101) {
                    System.out.println("Конец игры");
                    break;
                }
                break;
            }
        }
    }
}
