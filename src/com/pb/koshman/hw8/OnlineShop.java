package com.pb.koshman.hw8;

import com.pb.koshman.hw7.Tshirt;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth()

        Scanner scan = new Scanner(System.in);
        System.out.println("Придумайте логин");
        String login = scan.nextLine();
        System.out.println("Придумайте пароль");
        String password = scan.nextLine();
        System.out.println("Повторите пароль");
        String confirmPassword = scan.nextLine();

    try {
        auth.signUp(login,password,confirmPassword);
    }
    catch (WrongLoginException e){
        System.out.println("Логин не соответствует параметрам" + e.getMessage());
    }
    catch (WrongPasswordException e){
        System.out.println("Пароль не соответствует параметрам" + e.getMessage());
    }
}




}
