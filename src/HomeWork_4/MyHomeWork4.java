package HomeWork_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyHomeWork4 {
    public static void main(String[] args) {
        createMoreArray();
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


    public static void start() {
        Scanner scanner = new Scanner(System.in);

        // Создаем массив целых чисел (можно изменить размер и значения)
        int[] originalArray = {1, 2, 3, 4, 5, 3, 2};

        // Запрашиваем число для удаления у пользователя
        System.out.print("Введите число для удаления: ");
        int numberToRemove = scanner.nextInt();

        // Удаляем все вхождения числа из массива
        int[] newArray = removeElement(originalArray, numberToRemove);

        // Если в массиве не было числа для удаления
        if (newArray.length == originalArray.length) {
            System.out.println("Число " + numberToRemove + " не найдено в массиве.");
        } else {
            // Выводим новый массив
            System.out.println("Новый массив без числа " + numberToRemove + ": " + Arrays.toString(newArray));
        }
        scanner.close();
    }

    // Метод для удаления всех вхождений числа из массива
    public static int[] removeElement(int[] array, int numberToRemove) {
        // Используем ArrayList для временного хранения элементов
        ArrayList<Integer> temp = new ArrayList<>();

        // Перебираем элементы исходного массива
        for (int element : array) {
            // Если элемент не равен удаляемому числу, добавляем его в ArrayList
            if (element != numberToRemove) {
                temp.add(element);
            }
        }

        // Если после удаления элементов в ArrayList ничего не осталось, то возвращаем исходный массив.
        if (temp.isEmpty()) {
            return new int[0];
        }

        // Создаем новый массив с размером, равным количеству элементов в ArrayList
        int[] newArray = new int[temp.size()];
        // Копируем элементы из ArrayList в новый массив
        for (int i = 0; i < temp.size(); i++) {
            newArray[i] = temp.get(i);
        }
        return newArray;
    }

    //    Создать и заполнить массив случайными числами
    //     и выведите максимальное, минимальное и среднее значение.
    //     для генерации случайного числа использоваться метод math.random().
    //      Пусть будет возможно создавать массив произвольного размера.
    //       пусть размер массива вводится с консоли


    public static void createMoreArray(){
        int [] array1 = {2,4,6,8,10};

        for (int i = 0; i < array1.length; i++){
            System.out.print(" " + array1[i]);
        }
        System.out.println(" ");

        int [] array2 = {1,3,5,7,9};
        for (int index = 0; index < array2.length; index++) {
            System.out.print(" " + array2[index]);
        }
     public static void avgArray1(){

        }
    }

}




