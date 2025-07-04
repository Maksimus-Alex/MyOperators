package HomeWork_9;

import HomeWork_9.exception.Abc;
import HomeWork_9.exception.Begin1a2b;
import HomeWork_9.exception.Begin555;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        checkText();

    }
    public static void checkText(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number Document: ");
        String numDocument = scanner.nextLine();

                System.out.println("You enter : " + numDocument);
        if (numDocument.startsWith("1a2b")) {
            try {
                throw new Begin1a2b("The document number start '1a2b'");
            } catch (Begin1a2b e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        if (numDocument.startsWith("555")) {
            try {
                throw new Begin555("The document number Start '555'");
            } catch (Begin555 e) {
                throw new RuntimeException(e.getMessage());

            }
        }
        if (numDocument.contains("abc")) {
            try {
                throw new Abc("The document number contains 'abc'");
            } catch (Abc e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}






