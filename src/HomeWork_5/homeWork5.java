package HomeWork_5;

import java.util.Random;
import java.util.Scanner;

public class homeWork5 {
    public static void main(String[] avg){
        buildChessBoard();
    }

    // Дз 0
    // Создать трехмерный массив целых чисел.
    // С помощью циков пройти по всему массиву и увеличить каждый элемент
    // на заданное число. Пусть число , задается с консоли

    public static void createMultiArray(){
        int[][][] array =
                {{{1, 2, 3}, {4, 5, 6}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}, {7, 8, 9}}};
//        int[][][] array = new int[2][3][4];
        // Создать трех мерный массив
        for (int a =0; a < array.length; a ++) {
            for (int in = 0; in < array[a].length; in++) {
                    for (int b = 0; b < array[a][in].length; b++) {
                        System.out.print(" " + array[a][in][b]);
                    }
                System.out.println();
            }
            System.out.println();
        }

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
                    System.out.print(" " + array[i][index][element]);

                }
                System.out.println();
            }
            System.out.println();
        }
    }






    public static void buildChessBoard(){

    //задаём шахматную доску двумерным массивом
    String [][] chessBoard = new String[8][8];

        for (int a = 0; a< chessBoard.length; a++) {

            for (int b = 0; b< chessBoard[0].length; b++) {
                if ((a + b) % 2 == 0) chessBoard[a][b] = "W"; // ПРоверяем четность чисел
                else chessBoard[a][b] = "B";
                System.out.print(" " + chessBoard[a][b]);
            }
            System.out.println();
        }
    }
}


