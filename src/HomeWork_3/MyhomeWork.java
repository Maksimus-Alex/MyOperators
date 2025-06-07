package HomeWork_3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MyhomeWork {
    public static void main(String[] args){
        findParity();
    }
// Программа которая принимает на вход число и на выход
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

    //Написать программу для вывода поры года по номеру месяца
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

    // Написать программу для вывода поры года по номеру месяца
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
