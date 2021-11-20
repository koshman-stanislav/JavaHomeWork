package com.pb.koshman.hw8;

import java.util.regex.Pattern;

public class WrongLoginException  extends Exception{
    if(Pattern.matches("[a-zA-Z0-9]{5,20}", login)){
        this.login = login;
    } else {
        throw new WrongLoginException("");
    }
}
