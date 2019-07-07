package ru.javabegin.training.fastjava2.Lesson3;

import java.util.Random;

public class task11_34 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] precipitation = new int[30];
        int dec1 = 0;
        int dec2 = 0;
        int dec3 = 0;
        int half1 = 0;
        int half2 = 0;

        //осащдки за месяц
        for (int i = 1; i < precipitation.length; i++) {
            int n = rand.nextInt(1000);//рандомайзер для осадков
            precipitation[i] = n;
        }
        //Вариант а)
        for (int i = 0; i < precipitation.length; i++) {
            if (i < 15) {
                half1 += precipitation[i];
            } else {
                half2 += precipitation[i];
            }
        }
        if (half1 > half2) {
            System.out.println("Осадков ббольше в первой половине.");
        } else {
            System.out.println("Осадков больше во второй половине.");
        }
        //Вариант б)
        for (int i = 0; i < precipitation.length; i++) {
            if (i < 10) {
                dec1 += precipitation[i];
            } else if (i >= 10 && i < 19) {
                dec2 += precipitation[i];
            } else {
                dec3 += precipitation[i];
            }
        }
        if (dec1 > dec2 && dec1 > dec3) {
            System.out.println("Осадков больше в dec1");
        } else if (dec2 > dec1 && dec2 > dec3) {
            System.out.println("Осадков больше в dec2");
        } else if (dec3 > dec1 && dec3 > dec2) {
            System.out.println("Осадков больше в dec3");
        }
    }
}

