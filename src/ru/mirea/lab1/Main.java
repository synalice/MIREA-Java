package ru.mirea.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("(для завершения программы введите 0)");
            System.out.print("Введите номер задания: ");
            Scanner scanner = new Scanner(System.in);
            int taskNum = scanner.nextInt();
            switch (taskNum) {
                case (3) -> task3();
                case (4) -> task4();
                case (5) -> task5(args);
                case (6) -> task6();
                case (7) -> task7();
                case (0) -> System.exit(0);
            }
        }
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= Задание 3 =======");
        System.out.print("Введите размер массива: ");

        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("Введите " + arrSize + " элементов массива:");

        for (int i = 0; i < arrSize; i++) {
            int elem = scanner.nextInt();
            arr[i] = elem;
        }

        int arrSum = 0;

        for (int i = 0; i < arrSize; i++) {
            arrSum += arr[i];
        }

        System.out.println("Сумма элементов массива: " + arrSum);
        System.out.println("Среднее арифметическое " + "элементов массива: " + arrSum / arrSize);
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= Задание 4 =======");
        System.out.print("Введите размер массива: ");

        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("Введите " + arrSize + " элементов массива:");

        for (int i = 0; i < arrSize; i++) {
            int elem = scanner.nextInt();
            arr[i] = elem;
        }

        int arrSum = 0;
        int arrMin = Integer.MAX_VALUE;
        int arrMax = Integer.MIN_VALUE;
        int i = 0;

        while (i < arrSize) {
            arrSum += arr[i];

            if (arr[i] > arrMax) {
                arrMax = arr[i];
            }

            if (arr[i] < arrMin) {
                arrMin = arr[i];
            }

            i++;
        }

        System.out.println("Сумма элементов массива: " + arrSum);
        System.out.println("Минимальный элемент массива:  " + arrMin);
        System.out.println("Максимальный элемент массива: " + arrMax);
    }

    public static void task5(String[] args) {
        System.out.println("======= Задание 5 =======");

        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void task6() {
        System.out.println("======= Задание 6 =======");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d) ", i);

            float result = 1;

            System.out.printf("%.0f", result);

            for (int j = 2; j <= i; j++) {
                result += (float) 1 / j;
                System.out.printf(" + 1/%d", j);
            }

            if (result == 1) {
                System.out.printf(" = %.0f\n", result);
            } else {
                System.out.printf(" = %.2f\n", result);
            }
        }
    }

    public static void task7() {
        System.out.println("======= Задание 7 =======");

        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int result = 1;

        for (int i = num; i > 0; i--) {
            result *= i;
        }

        System.out.printf("%d! = %d\n", num, result);
    }
}
