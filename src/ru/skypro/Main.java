package ru.skypro;
import java.util.Arrays;
public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000, 200_000);
        }
        System.out.println(Arrays.toString(arr));

        return arr;
    }

        public static void main (String[] args) {

        java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000, 200_000);
            }
            System.out.println(Arrays.toString(arr));

            int sum = 0;
            sum = Arrays.stream(arr).sum();
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

            //Min + Max

            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i++)
                if (min > arr[i]) {
                    min = arr[i];
                } else if (max < arr[i]) {
                    max = arr[i];
                }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

            // Avarage

            double avarage = 0;
            for (int i = 0; i < arr.length; i++) {
                avarage += arr[i] / arr.length;
            }
            System.out.println("Средняя сумма трат за месяц составила " + avarage + " рублей");

            //Задача 4
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
    }
}





