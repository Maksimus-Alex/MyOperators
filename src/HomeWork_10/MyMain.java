package HomeWork_10;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {

        public static void main(String[] args) {
            String documentNumber = "5896-uer-1816-izi-1p3q";// примерный номер документа
            System.out.println("Document Number is: "+documentNumber + "\n");
            functionalDocument(documentNumber);
        }

        public static void functionalDocument(String documentNumber){
            // 1 - вывести на экран строку два первых блока по 4 цифры
            String[] blocks = documentNumber.split("-");
            System.out.println("First two blocks of numbers: "
                    + blocks [0] +"-"+ blocks[2] + "\n");

            // 2 - вывести на экран номер документа , нг блоки из 3 букв
            // заменить на ***
            String stars = documentNumber.replaceAll("[a-z]{3}", "***");
            System.out.println("Replacing: " + stars);

            // 3 - Вывести на экран только одни буквы из номера документа
            // в формате ууу/ууу/у/у в нижнем регистре

            String latters = documentNumber;
            StringBuilder latter = new StringBuilder();
            for(int i = 0; i< latters.length(); i++){
                char c = latters.charAt(i);
                if (Character.isLetter(c)){
                    latter.append(c);
                }
            }
            System.out.println("Only letters: " + latter.toString());







        }


    }
