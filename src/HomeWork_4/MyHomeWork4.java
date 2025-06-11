package HomeWork_4;

import java.util.Random;
import java.util.Scanner;

public class MyHomeWork4 {
    public static void main(String[] args){
        findArray();
    }
    public static void findArray(){
        int [] array = new int[]{1,11,21,31};

        // массив создали
        // теперь нужено число для проверки
        // значит нужен для него запрос через сканер

        Scanner num = new Scanner(System.in);
        System.out.println("Please Enter yuor number: ");
        int findNum = num.nextInt();

        // Нужна проверка подходит это число или нет
        // проще будет сделать чрез true

        boolean number = false;
        for (int index = 0; index< array.length; index++){
            if (array[index] == findNum){
                number = true;
                break;
            }
        }
        if (number){
            System.out.println("Number " + number );
        }
        else {
            System.out.println("Number " + number );
        }

    }
}

