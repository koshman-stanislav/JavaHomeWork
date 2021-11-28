package com.pb.koshman.hw10;

public class NumBox<T extends Number> {

    private final T[] numbers;
    int full;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }
    
     void add(T num) {
        if(this.full >= this.numbers.length){
        }
        this.numbers[this.full]=num;
        this.full++;
    }

    public int length(){
        return this.full;
    }

    public T get(int index) {
        return numbers[index];
    }

    public double average() {
        double sum = 0.0;

        for (T value : numbers) {
            if( value!=null)
                sum += value.doubleValue();
        }

        return sum / this.full;
    }


    public double sum() {
        double sum = 0.0;

        for (T value : numbers) {
            if( value!=null)
                sum += value.doubleValue();
        }
        return sum;
    }
    public double max() {
        double startMax = 0.0;

        for (T value : numbers) {
            if( value!=null && value.doubleValue()>startMax)
                startMax=value.doubleValue();
        }
        return startMax;
    }

    public void set(int size, T numbers) {
        this.numbers[size] = numbers;
    }

    public int getSize () {
        return numbers.length;
    }

}
