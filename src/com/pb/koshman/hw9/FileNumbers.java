package com.pb.koshman.hw9;

import java.io.*;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) throws Exception {
        createNumbersFile();
        createOddNumbersFile();
    }

    public static void createNumbersFile() throws Exception{
        try {
            Writer writer = new FileWriter("numbers.txt");
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++, System.out.println()){
                for (int j = 0; j < array.length; j++){
                    array[i][j] = ((int) (Math.random() * 99 + 1));
                    System.out.print(array[i][j] + " ");
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }
            writer.close();
        } catch (Exception ex) {
            System.out.println("файл не записан" + ex);
        }
    }

    public static void createOddNumbersFile() throws IOException {
        try (Scanner in = new Scanner(new File("numbers.txt"))) {
            PrintWriter pw = new PrintWriter(new File("odd-numbers.txt"));
            System.out.println("вывод чисел с заменой четных на 0:");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int ch = line.nextInt();
                    if (ch % 2 == 0) {
                        System.out.println("0");
                        ch = 0;
                    } else
                        System.out.println(ch + " ");
                    pw.println(ch + " ");
                }
                line.close();
                pw.println();

            }
            System.out.println();
            pw.close();
        } catch (IOException ioException) {
            System.out.println("не удалось записать файл" + ioException);
        }
    }
}