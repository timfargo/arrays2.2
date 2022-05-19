package sky.pro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила" + sum + "рублей");

        // Задание 2
        int min = 200_000;
        int max = 100_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей", min, max);

        // Задание 3
        double averege = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила" + averege + "рублей");

        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'i'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }



        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    }







