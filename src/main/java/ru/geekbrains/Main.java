package ru.geekbrains;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] num = {32, 12, 2, 1, 3, 4, 5, 4, 54, 34, 9, 0, 4, 3, 2, 1};

        int[] num1 = new int[10];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(newArray(num)));
        System.out.println(Arrays.toString(newArray(num1)));

    }


    public static int[] newArray(int[] arr) {

        //Счетчик для понимания есть ли в массиве 4
        int c = 0;

        for (int j : arr) {
            if (j == 4) {
                c++;
                break;
                }
            }

        //Бросаем исключение, если не нашли 4
        if (c == 0) {
            throw new RuntimeException("Не нашли 4 в вашем массиве");
        }

        //Проверяем массив с конца до первой найденной 4
        int numFour = 0;
        for (int i = arr.length; i > 0; i--) {
            if (arr[i - 1] == 4) {
                numFour = i;
                break;
            }
        }

        //Копируем полученный массив
        int[] temp = Arrays.copyOfRange(arr, numFour, arr.length);
        if (temp.length == 0) {
            return null;
        }
        return temp;
    }



}
