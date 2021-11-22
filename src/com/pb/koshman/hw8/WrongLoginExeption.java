package com.pb.koshman.hw8;

public class WrongLoginExeption extends Exception{
    public WrongLoginExeption() {
    }

    public WrongLoginExeption(String message) {
        super(message);
    }
}
