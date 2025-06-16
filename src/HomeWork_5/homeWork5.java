package HomeWork_5;

import java.util.Random;
import java.util.Scanner;

public class homeWork5 {
    public static void main(String[] avg){
        createMultiArray();
    }

    // Дз 0
    // Создать трехмерный массив целых чисел.
    // С помощью циков пройти по всему массиву и увеличить каждый элемент
    // на заданное число. Пусть число , задается с консоли

    public static void createMultiArray(){
        Random arrayElement = new Random();
        int random = arrayElement.nextInt();
        int[][][] array = new int[2][3][4];
        // Создать трех мерный массив

        System.out.print("Enter num: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("the number to incremen: " + num);


        // теперь самое главное не запутаться в циклах
        // 1 - раз length обращение от самого массива, возвращает количество строк в массиве
        // 2 - раз от его СТРОКИ - количество элементов в строке.
        for (int i =0; i < array.length; i ++){
            for (int index = 0; index< array[i].length; index++){
                for (int element = 0; element < array[i][index].length; element++){
                    array[i][index][element] = array[i][index][element] + num;
                    System.out.println(" Array " + array[i][index][element]);
                }
            }
        }
    }
}
