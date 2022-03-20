package ru.skypro;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        // Задача 4
        char[]reverseFullName={'n','a','v','I',' ','v','o','n','a','v','I'};
        int size=reverseFullName.length;
        for(int i=0;i<size /2;i++){
            int temp=reverseFullName[i];
            reverseFullName[i]=reverseFullName[size-1-i];
            reverseFullName[size-1-i]=(char)temp;
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(reverseFullName));

        System.out.println();

        int[] arr = generateRandomArray();
    }
    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000, 200_000);
        }
        System.out.println(Arrays.toString(arr));

        //
        int sum = 0;
        sum = Arrays.stream(arr).sum();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Min

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        //Max

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        // Avarage

        double avarage = 0;
        for (int i = 0; i < arr.length; i++) {
            avarage += arr[i] / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + avarage + " рублей");
        return arr;
    }
}
