package ru.javabegin.training.fastjava2.Lesson3;

public class task11_53 {
    public static void main(String[] args) {
        double[] numbers = new double[20];
        int n = 2;
        int m = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        //Вариант а)
        /*for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 10 == 0){
                numbers[i] = 0;
            }
        }*/
        //Вариант б)
        /*for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = numbers[i] / 2;
            }else {
                numbers[i] = numbers[i] * 2;
            }
        }*/
        //Вариант в)
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] - m;
            } else if (i % 2 !=0) {
                numbers[i] = numbers[i] + n;
            }
        }
    }
}
