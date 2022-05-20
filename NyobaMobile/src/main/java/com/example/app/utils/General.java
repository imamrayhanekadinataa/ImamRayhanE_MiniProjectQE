package com.example.app.utils;

import java.util.Random;

public class General {

    Random num = new Random();

    public String randomNumForEmail(String Email){
        return "imamrayhane" + num.nextInt(100) + "gmail.com";
    }
}
