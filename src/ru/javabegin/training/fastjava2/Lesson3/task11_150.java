package ru.javabegin.training.fastjava2.Lesson3;

public class task11_150 {
    public static void main(String[] args){
        int n = 3;
        int[] value = new int[20];
        for (int i = 0; i < value.length; i++) {
            value[i] += i + 1;
        }for (int i = 0; i < value.length; i++){
            if (i == n){
                value[i] = 0;// т.к. у обычного массива нет удаления, заменяю нулем;
            }
        }

    }
}
