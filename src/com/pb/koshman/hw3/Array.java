package com.pb.koshman.hw3;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите одномерный массив целых чисел размерностью 10 элементов.После каждого числа нажимая Enter");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Заполненый массив");
        for (int i=0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int Sum = 0;
        for( int num : array) {
            Sum = Sum + num;
        }
        System.out.println("Сумма ="+Sum);
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) { counter++; }
        }
        System.out.println("Положительных чисел:" + counter);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            System.out.println();
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println("Отсортированный массив");
            for (int i=0;i < array.length;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
}
