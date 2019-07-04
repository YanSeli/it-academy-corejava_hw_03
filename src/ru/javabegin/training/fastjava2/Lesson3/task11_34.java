package ru.javabegin.training.fastjava2.Lesson3;

import java.util.Random;

public class task11_34 {
    public static void main(String[] args) {
        int[] precipitation = new int[30];
        Random rand = new Random();
        for (int i = 0; i < precipitation.length; i++) {
            int n = rand.nextInt(1000);//рандомайзер для осадков
            precipitation[i] = n;
        }
        int[] half1 = new int[15];
        int[] half2 = new int[15];
        for (int i = 0; i < precipitation.length; i++) {
            if (i <= 15) {
                half1[i] = precipitation[i];
            } else {
                half2[i] = precipitation[i];
            }
        }
    }
}