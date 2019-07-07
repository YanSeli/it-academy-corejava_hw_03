package ru.javabegin.training.fastjava2.Lesson3;

public class task11_140 {
    public static void main(String[] args) {
        int[] february = new int[28];
        int min1, min2;
        int buff;
        for (int i = 0; i < february.length; i++) {
            february[i] += i + 1;
        }
        if (february[0] < february[1]) {
            min1 = february[0];
            min2 = february[1];
        } else {
            min2 = february[0];
            min1 = february[1];
        }
        for (int i = 2; i < february.length; i++) {
            if (february[i] < min1) {
                buff = min1;
                min1 = i;
                if (buff < min2) {
                    min2 = buff;
                }
            }
            else if (february[i] < min2) {
                min2 = i;
            }
        }
        System.out.println(min1);
        System.out.println(min2);
    }
}