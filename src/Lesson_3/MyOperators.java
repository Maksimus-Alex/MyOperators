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

public class MyOperators {
    public static void main(String[] args) throws IOException {

    }
    public static void enterOneSymbol() throws IOException {
        System.out.print("Pleas enter a value: ");


        int value = System.in.read();
        System.out.println("You have entered the following symbl in char: " + (char) value);
        System.out.println("You have entered the following symbl in Ascil code: " +  value);
    }



}
