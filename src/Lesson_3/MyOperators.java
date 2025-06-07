package Lesson_3;

// $ git add .
// $ git commit -am "SOME MESSAGE"

// $ git push подгрузить все изменения на ГитХаб

// $ git fetch - проверить количество коммитов на ГитХабе и сравнить с количеством коммитов на локальном Гите
// $ git status - получить результат сравнения

// Lesson 3 -> Operators
// if, else if, switch - flow operators
// while, do while, for - loops (циклы)
// Три ключевых слова: break, continue, return


import java.io.IOException;
import java.util.Scanner;

public class MyOperators {
    public static void main(String[] args) throws IOException {
        getScanner();
    }

    public static void getScanner(){
        // Difference between SCANNER and System.in.read()
        // System.in.read() - требует пробрасывания исключения
        // Использует стандартный класс вывода System
        // Может брать только один символ

        // Scanner - специальный класс, который надо добавить из пакета
        // Он создан для упрощения ввода данных с клавиатуры

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Please enter your surname: ");
        String surname = input.nextLine();
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("please enter your weight: ");
        double weight = input.nextDouble();
        System.out.println(" Are you married (true/false)");
        boolean isMarried = input.nextBoolean();

    }

    public static void enterOneSymbol() throws IOException {
        System.out.print("Pleas enter a value: ");


        int value = System.in.read();
        System.out.println("You have entered the following symbl in char: " + (char) value);
        System.out.println("You have entered the following symbl in Ascil code: " +  value);
    }

}
