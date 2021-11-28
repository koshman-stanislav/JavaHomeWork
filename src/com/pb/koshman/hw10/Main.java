package com.pb.koshman.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> integerNumBox = new NumBox<>(3);
        try {
            integerNumBox.add(15);
            integerNumBox.add(14);
            integerNumBox.add(26);
            integerNumBox.add(10);
        }
        catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив заполнен полностью, длинна массив =  " + integerNumBox.getSize());
            e.printStackTrace();
        }
        for (int i=0; i< integerNumBox.length(); i++) {
            System.out.println(integerNumBox.get(i));
        }
        System.out.println("Элементов в массиве : " + integerNumBox.length() );
        System.out.println("Максимальное значение элемента массива =  " + integerNumBox.max());
        System.out.println("Сумма элементов массива = " + integerNumBox.sum());
        System.out.println("Среднее арифметическое значение элементов массива = " + integerNumBox.average());

        NumBox<Float> floatNumBox = new NumBox<>(6);
        try {
            floatNumBox.add(8.63F);
            floatNumBox.add(1.06F);
            floatNumBox.add(8.20F);
            floatNumBox.add(3.76F);
            floatNumBox.add(1.7F);
        }
        catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив заполнен полностью, длинна массив =  " + floatNumBox.getSize());
            e.printStackTrace();
        }
        for (int i=0; i< floatNumBox.length(); i++) {
            System.out.println(floatNumBox.get(i));
        }
        System.out.println("Элементов в массиве : " + floatNumBox.length());
        System.out.println("Максимальное значение элемента массива =  " + floatNumBox.max());
        System.out.println("Сумма элементов массива = " + floatNumBox.sum());
        System.out.println("Среднее арифметическое значение элементов массива = " + floatNumBox.average());
    }
}
