package ru.javabegin.training.fastjava2.Lesson3;

public class task11_101 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] += i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] == array[k]) {
                    a++;
                }
            }
        }
        if (a == 0) {
            System.out.println("Нет одинаковых эллементов");
        } else if (a == 1) {
            System.out.println("Два одинаковых эллемента");
        } else {
            System.out.println("Больше 2х одинаковых эллемента");
        }
    }
}
