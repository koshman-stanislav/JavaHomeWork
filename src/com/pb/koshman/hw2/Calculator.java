package com.pb.koshman.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sing;
        System.out.print("Введите первое число: ");
        operand1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        operand2 = scan.nextInt();
        System.out.print("Введите знак арифметической операции + / - / * / / : ");
        sing = scan.next();
        switch (sing) {
            case "+":
                System.out.println("Ответ: " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Ответ: " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Ответ: " + (operand1 * operand2));
                break;
            case "/" :
                if (operand2 != 0) {
                    System.out.println("Ответ: " + (operand1 / operand2));
                }
                else System.out.println("на 0 дельть нельзя");
                break;
            default:
                System.out.println("Попробуйте еще раз");
        }
    }
}
