package com.pb.koshman.hw8;

public class WrongPasswordException extends Exception{

    while( (password.length() < 6) || (password.length() > 10) )
    {
        System.out.print("This password must be between 6 and 10 characters. Try again: ");
        password = input.nextLine();
    }
}
