package com.example.benjamin.initialapp;

import java.util.Random;

/**
 * Created by Benjamin on 08/11/2017.
 */

public class Utils {

    public static int generateRandomNumber(int max){
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int randomNumber = random.nextInt(max);

        return randomNumber;
    }
}
