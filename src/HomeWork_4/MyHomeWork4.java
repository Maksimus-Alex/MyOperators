package HomeWork_4;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyHomeWork4 {
    public static void main(String[] args) {
        createTwoArray();
    }

    // Дз 0
    // Создать массив целых чисел
    //  Программа которая выводит сообщение о том, входит ли заданное число в массив или нет
    // Число для поиска с консоли Scznner
    public static void findArray() {
        int[] array = new int[]{1, 11, 21, 31};

        // массив создали
        // теперь нужено число для проверки
        // значит нужен для него запрос через сканер

        Scanner num = new Scanner(System.in);
        System.out.println("Please Enter yuor number: ");
        int findNum = num.nextInt();

        // Нужна проверка подходит это число или нет
        // проще будет сделать чрез true

        boolean number = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == findNum) {
                number = true;
                break;
            }
        }
        if (number) {
            System.out.println("Number " + number);
        } else {
            System.out.println("Number " + number);
        }

    }

    // Дз 1
    // Создать массив целых чисел
    // удалить все вхождения заданного числа из массива.
    // Число задается с консоли Scaner
    // если такого числа нет. Вывести сообщение об этом
    // в резулятате должен быть новый массив без указанного числа

    public static void deletElementArray() {
        // Создаем массив целых чисел
        int[] originalArray = {1, 2, 3, 5, 9, -15, 20};
        for (int element = 0; element < originalArray.length; element++) {
            System.out.print(originalArray[element] + " ");
        }
        System.out.println(" ");

        // запрашиваем елемент чрезе сканер
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Element to remove: ");
        int removeNum = input.nextInt();

        // Смотри сколько вхождений числа было
        // то есть проверка наличия в массиве данного числа
        int enter = 0;
        for (int num : originalArray) {
            if (num == removeNum) {
                enter++;
            }
        }

        // Ели число на найденно в массиве вывести сообщение об этом
        if (enter == 0) { // сравнивает только ссылки, то есть проверяет, равен ли объект самому себе
            System.out.println("Your element not found");
            return;
        }

        // Тут Сложно.
        // Создать новый массив но при этом без этого числа которое мы указали
        int[] newArray = new int[originalArray.length - enter];
        int i = 0;
        for (int newNnum : originalArray) {
            if (newNnum != removeNum) { // равно true , но если removnum false иначе все будет false
                newArray[i++] = newNnum;
            }
        }

        System.out.println("Your element to remove " + removeNum);
        System.out.print("New Array");
        for (int removeElement : originalArray) {
            System.out.print(removeElement + " ");
        }
    }

    public static void enterNewArray(int[] originalArray) {
        for (int num : originalArray) {
            System.out.println(num);
        }
    }

    // Дз 2
    // Создать и заполнить массив случйнми числами и вывести
    // максимальное , минимальное , среднее значение
    // Массив произвольного размера
    // Размер массива вводится с консоли
    // Использовать метод Math.random()

    public static void randomArray() {
        // создать массив и спроситьь про размер массива
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length array: ");
        int length = input.nextInt();
        // только сделал запрос но ничего не вывел

        double[] array = new double[length];
        for (int index = 0; index < length; index++) {
            array[index] = Math.random();
            System.out.println(" " + array[index]);
        }
        // Поиск Значений
        // bcgjkmpe. double т.к. там значение с плавающей точкой
        // а значит не будет выбивать ошибку во время поиска среднего значения
        double max = array[0]; // В результате выполнения этой строки,
        // переменная max будет содержать значение первого элемента массива array
        double min = array[0];
        double sum = 0;// эта строка создает переменную sum
        // предназначенную для хранения числовых значений с дробной частью

        for (double num : array) {// перебираем все элементы массива
            if (num > max) {
                max = num; // если в if все истинное тогда будет выполняться эта строчка
            }
            if (num < min) {
                min = num;
            }
            sum = sum + num;
        }
        double averege = sum / length;

        System.out.println("************************");

        System.out.println("Max " + max);
        System.out.println("Min " + min);
        System.out.println("Avg " + averege);

        // Шпаргалка
//        int n = 100;
//        double[] array = new double[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Math.random();
//        }
//
//        double max = array[0]; // Массив не должен быть пустым
//        double min = array[0];
//        double avg = 0;
//        for (int i = 0; i < array.length; i++) {
//            if(max < array[i])
//                max = array[i];
//            if(min > array[i])
//                min = array[i];
//            avg += array[i]/array.length;
//        }
//
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);
//        System.out.println("avg = " + avg);
//    }


    }


    // дЗ 3
    // Создать 2 массива из 5 чисел
    // почитать среднее арифмитическое какждого массива
    // Сообщить для какого масива это значение оказалось больше
    // либо сообщите что их среднее арифмитечкие равны


    public static void createTwoArray() {
        // Создаем 2 массива из 5 чисел и выводим их


        int[] oneArray = {1, 3, 5, 7, 9};
        for (int oneElement = 0; oneElement < oneArray.length; oneElement++) {
            System.out.print( oneArray[oneElement] + " ");
        }
        System.out.println(" ");


        int[] twoArray = {2, 4, 6, 8, 10};
        for (int twoElement = 0; twoElement < twoArray.length; twoElement++) {
            System.out.print(twoArray[twoElement] + " ");
        }
        System.out.println(" ");


        double avgFirst = calculateAvarage(oneArray);
        double avgSecond = calculateAvg(twoArray);
        System.out.println("\n Avarage 1 = " + avgFirst);
        System.out.println("\n Avarage 2 = " + avgSecond);

        if (avgFirst>avgSecond){
            System.out.println("The arithmetic mean of the first array is greater");
        }
        if (avgFirst<avgSecond){
            System.out.println("The arithmetic mean of the second array is greater");
        }
        else {
            System.out.println("The arithmetic means of the arrays are equal");
        }
    }

    public static double calculateAvarage(int[] oneArray) {

        // поиск первого среднего
        int sum = 0;
        for (int number : oneArray) {
            sum = sum + number;
        }

        return (double) sum / oneArray.length;
    }

    public static double calculateAvg(int[] twoArray) {
        int sumSecond = 0;
        for (int element : twoArray) {
            sumSecond = sumSecond + element;
        }
        return (double) sumSecond/ twoArray.length;
    }
}




