package com.company;

import java.util.Arrays;
import java.util.Random;

/*Задание 13
Создать последовательность случайных чисел, найти и вывести наибольшее
из них.*/
        public class Zadanie13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(20)];
       // int array = new int;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20) + 1;
            if (array[i] > max) max = array[i];
        }
        System.out.println("Случайные числа: " + Arrays.toString(array));
        System.out.println("Максимальное число: " + max);
    }
        }
