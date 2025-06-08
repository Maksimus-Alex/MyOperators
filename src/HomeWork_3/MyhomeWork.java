package HomeWork_3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MyhomeWork {
    public static void main(String[] args){
        findSumNum();
    }

    // написать программу где вволится число ПолоЖИТЕЛЬНОЕ.
    // программа суммирует ввсе число от 1 до введенного числа
    // для вода числа воспользоваться классом Scaner
    public static void findSumNum(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Your Num: "+ num);
        for(int i = 1; i<num; i++){
            System.out.println( + i);
        }


    }



    // Дз 2 вывести числа от 5 до 1
    // использовать декремент --
    public static void useNum(){
        for(int i = 5; i>0; i--){
            System.out.println("Num " + i);
        }
    }


    // Циклы
    // Дз 1. при помощи цикла for вывести на экран нечетные числа от 1 до 99
    // использовать операцию инкремента ++
    public static void findNum(){
        // выводим числа от 1 до 99
        for(int i = 1; i<100; i++){
            int a = i % 2; // Теперь надо вывести только нечетные числа
            if (a == 0)
                continue;
            System.out.println("Your num " + i);
        }

    }






    // дз 5. по введеному номеру определить цвет радуги
    //1 Красный: Red
    //2 Оранжевый:Orange
    //3 Желтый:Yellow
    //4 Зеленый:Green
    //5 Голубой:Cyan
    //6 Синий:Blue
    //7 Фиолетовый:Purple
    public static void findTheColor() {
        System.out.print("Plese enter your number color (1 to 7): ");
        Scanner input = new Scanner(System.in);
        int color = input.nextInt();
        switch (color) {
            case 1:
                System.out.println(" Your Color is Red");
                break;
            case 2:
                System.out.println(" Your Color is Orange");
                break;
            case 3:
                System.out.println(" Your Color is Yellow");
                break;
            case 4:
                System.out.println("Your Color is Green");
                break;
            case 5:
                System.out.println("Your Color is Cyan");
                break;
            case 6:
                System.out.println(" Your Color is Blue");
                break;
            case 7:
                System.out.println(" Your Color is Purple");
                break;
            default:
                System.out.println("Wrong COLOR number!");
                break;
        }
    }

    // дз 4. найти температуру
    // для введенного числа вывести Тепло,Холодно , нормально

    public static void findTemp(){

        System.out.print("Plese enter your Temp (t): ");
        Scanner input = new Scanner(System.in);
        double t = input.nextDouble();
        if (t>-5) {
            System.out.println("Warm");
        }
           else if (t > -20 && t <= -5) {
            System.out.println("Norm");
        }
           else if (t<= -20) {
            System.out.println("Cold");
        }
    }
    // дз 3. Программа которая принимает на вход число и на выход
    //будет выводить сообщение четное оно или нет

    // попросить ввести число
    // прогнать через формулу деления (остаток от деления)
    // в зависимости от выявлемого результат он будет либо чет либо нечет.

    public static void findParity(){

        System.out.print("Plese enter your number: ");
        Scanner input = new Scanner(System.in);
        double division = input.nextDouble();

        // прогнать через формулу
        System.out.println("Your num " + division);
        double num = division % 2;
        System.out.println(" Your division: " + num);
        // теперь надо указать четность или нечетность
        if(num == 1){
            System.out.println("Your num is odd");
        } else if (num == 0) {
            System.out.println("Your num is even");

        }


    }

    // дз 2. Написать программу для вывода поры года по номеру месяца
    // использовать оператор if else if

    public static void useElseIfSeason(){
        System.out.print("Plese enter your number (1 to 12): ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num > 5 && num < 9){
            System.out.println("Your Season is Summer");
        }
         else if (num > 8 && num < 12){
            System.out.println("Your Season is Fall");
        }
         else if (num > 0 && num < 3){
            System.out.println(" Your Season is Winter");
        }
         else if (num ==12){
            System.out.println(" Your Season is Winter");
        }
        else if (num > 2 && num < 6){
            System.out.println(" Your Season is Spring");
        }
        else {
            System.out.println(" Wrong number");
        }


    }

    //  ДЗ 1. Написать программу для вывода поры года по номеру месяца
    // использовать оператор switch/case
//    Времена года:
//    Winter: (зима)
//    Spring: (весна)
//    Summer: (лето)
//    Autumn: (осень, в британском английском)
//    Fall: (осень, в американском английском)
//    Месяцы:
//    January: (январь)
//    February: (февраль)
//    March: (март)
//    April: (апрель)
//    May: (май)
//    June: (июнь)
//    July: (июль)
//    August: (август)
//    September: (сентябрь)
//    October: (октябрь)
//    November: (ноябрь)
//    December: (декабрь
    public static void getSwitcSeason(){
        System.out.print("Plese enter your number (1 to 12): ");
        Scanner input = new Scanner(System.in);
        int mouth = input.nextInt();
        switch (mouth) {
            case 12:
                System.out.println(" Your Season is Winter");
                break;
            case 1:
                System.out.println(" Your Season is Winter");
                break;
            case 2:
                System.out.println(" Your Season is Winter");
                break;
            case 3:
                System.out.println(" Your Season is Spring");
                break;
            case 4:
                System.out.println(" Your Season is Spring");
                break;
            case 5:
                System.out.println(" Your Season is Spring");
                break;
            case 6:
                System.out.println(" Your Season is Summer");
                break;
            case 7:
                System.out.println(" Your Season is Summer");
                break;
            case 8:
                System.out.println(" Your Season is Summer");
                break;
            case 9:
                System.out.println(" Your Season is Fall");
                break;
            case 10:
                System.out.println(" Your Season is Fall");
                break;
            case 11:
                System.out.println(" Your Season is Fall");
                break;
            default:
                System.out.println("Wrong number!");
                break;
        }



    }

}
