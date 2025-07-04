package HomeWork_9;

import HomeWork_9.exception.Abc;
import HomeWork_9.exception.Begin1a2b;
import HomeWork_9.exception.Begin555;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter number Document: ");
           String numDocument = scanner.nextLine();
           System.out.println("You enter : " + numDocument);


    }

    public static void сheckNumber(String numDocument) throws Abc,Begin555,Begin1a2b{
        if (numDocument.contains("abc")){
            throw new Abc("The document number contains 'abc'");
        }
        if (numDocument.startsWith("555")){
            throw new Begin555("The document number Start '555'");
        }
        if (numDocument.startsWith("1a2b")){
            throw new Begin1a2b("The document number start '1a2b'");
        }

    }



}
