package com.pb.koshman.hw8;

import com.pb.koshman.hw7.Tshirt;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth();

        Scanner scan = new Scanner(System.in);
        System.out.println("Придумайте логин");
        String log = scan.nextLine();
        System.out.println("Придумайте пароль");
        String passw = scan.nextLine();
        System.out.println("Повторите пароль");
        String confirmPassw = scan.nextLine();

    try {
        auth.signUp(log,passw,confirmPassw);
    }
    catch (WrongLoginExeption e){
        System.out.println("Логин не соответствует параметрам" + e.getMessage());
        e.printStackTrace();
    }
    catch (WrongPasswordException e){
        System.out.println("Пароль не соответствует параметрам" + e.getMessage());
        e.printStackTrace();
        return;
    }
        System.out.println("Войдите на сайт");
        System.out.println("Введите логин");
        String log2 = scan.nextLine();
        System.out.println("Введите пароль");
        String passw2 = scan.nextLine();

        try {
            auth.signIn(log2, passw2);

        }
        catch (WrongLoginExeption e1) {
            System.out.println("Ошибка при входе " + e1.getMessage());
            e1.printStackTrace();
        }
    }
}
