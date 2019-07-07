package ru.javabegin.training.fastjava2.Lesson3;

import java.util.Arrays;

public class task12_192 {
    public static void main(String[] args) {
        int[][] array = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        int a = array.length - 1;
        int b = array[0].length - 1;
        int rightDown = array[a][b];//правый нижний
        int leftDown = array[a][0];//левый нижний
        int leftUp = array[0][0];//левый верхний
        int rightUp = array[0][b];//правй верхний
        int buff1;
        int buff2;
        //Вариант а)
        buff1 = leftUp;
        array[0][0] = leftDown;
        array[a][0] = leftUp;
        //Вариант б)
        buff2 = rightUp;
        array[0][b] = rightDown;
        array[a][b] = rightUp;
        System.out.println();
        System.out.println("Change");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}