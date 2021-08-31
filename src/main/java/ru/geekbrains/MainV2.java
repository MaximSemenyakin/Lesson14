package ru.geekbrains;

import java.util.stream.IntStream;

public class MainV2 {

    public static void main(String[] args) {

        int[] num = {4, 1, 4, 1, 1, 1, 3};
        int[] num1 = {1, 2, 4, 4, 1, 4};

        boolean contains = IntStream.of(num1).allMatch(x -> x == 1 || x == 4);

        System.out.println(contains);

        System.out.println(checkArray(num, 1, 4));

    }

    //Метод для проверки, что в массиве содержаться только 1 и 4
    public static boolean checkArray(int[] arr, int num1, int num2) {

        boolean flag1 = false;
        boolean flag4 = false;

        for (int x : arr) {
            if (x == num1) flag1 = true;
            else if (x == num2) flag4 = true;
            else return false;
        }


        return flag1 && flag4;
    }

}
