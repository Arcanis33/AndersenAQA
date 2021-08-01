package school.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkSecondLesson {
    public static void main(String[] args) {

        // ввод чисел и сохранение результата (первое задание)
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = sc.nextInt();
        System.out.println("Введите второе число");
        int second = sc.nextInt();
        boolean result = HomeworkFirst(first, second);
        System.out.println(result);

        // второе задание
        HomeworkSecond(5);

        // третье задание
        boolean resultThird = HomeworkThird(5);
        System.out.println(resultThird);

        // четвертое задание
        HomeworkFourth(5, "Пять");

        // пятое задание
        boolean resultFifth = HomeworkFifth(5);
        System.out.println(resultFifth);

        //шестое задание
        HomeworkSixth();

        //седьмое задание
        HomeworkSeventh();

        //восьмое задание
        HomeworkEighth();

        //девятое задание
        HomeworkNinth(5);

        //десятое задание
        HomeworkTenth(5, 5);
    }

    // функция первого задания
    static boolean HomeworkFirst(int first, int second) {
        int third = first + second;
        if (third >= 10 && third <= 20)
            return true;
        else
            return false;
    }

    // второе задание
    static void HomeworkSecond(int first) {
        if (first >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    // третье задание
    static boolean HomeworkThird(int first) {
        if (first >= 0)
            return false;
        else
            return true;
    }

    // четвертое задание
    static void HomeworkFourth(int a, String string) {
        for (int i = 0; i < a; i++) {
            System.out.println(string);
        }
    }

    // пятое задание
    static boolean HomeworkFifth(int five) {
        if (five % 4 == 0 && five % 100 != 0)
            return true;
        else if (five % 400 == 0) return true;
        else return false;
    }

    // шестое задание
    static void HomeworkSixth() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }


    }

    // седьмое задание
    static void HomeworkSeventh() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    // восьмое задание
    static void HomeworkEighth() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] < 6) array[i] = array[i] * 2;
        }
        for (int i = 0; i < arrayLength; i++) ;
    }

    //девятое задание
    static void HomeworkNinth(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (0);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    //десятое задание
    static int HomeworkTenth(int len, int initialValue) {
        int arr[] = new int[len];
        Arrays.fill(arr, initialValue);
        return len;
    }
}
















