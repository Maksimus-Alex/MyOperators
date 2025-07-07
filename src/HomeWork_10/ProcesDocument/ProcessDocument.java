package HomeWork_10.ProcesDocument;

public class ProcessDocument {

        public static void functionalDocument(String documentNumber) {
            // 1 - вывести на экран строку два первых блока по 4 цифры
            String[] blocks = documentNumber.split("-");
            System.out.println("First two blocks of numbers: "
                    + blocks[0] + "-" + blocks[2] + "\n");
        }

            public static void replaceAll(String documentNumber) {
                // 2 - вывести на экран номер документа , нг блоки из 3 букв
                // заменить на ***
                String stars = documentNumber.replaceAll("[a-z]{3}", "***");
                System.out.println("Replacing: " + stars);
            }

    public static void numDocument(String documentNumber) {
        // 3 - Вывести на экран только одни буквы из номера документа
        // в формате ууу/ууу/у/у в нижнем регистре
        String latters = documentNumber;
        StringBuilder latter = new StringBuilder();
        for (int i = 0; i < latters.length(); i++) {
            char c = latters.charAt(i);
            if (Character.isLetter(c)) {
                latter.append(c);
            }
        }
        System.out.println("Only letters: " + latter.toString());
    }


        public static void checkDocument(String documentNumber) {

            // 5 - Проверить содержит ли номер документа последовательность abc
            if (documentNumber.toLowerCase().contains("abc")) {
                System.out.println("Found 'abc'");
            } else {
                System.out.println("Not found 'abc'");
            }

            // 6 - Проверить начинается ли номер документа с последовательности 555
            if (documentNumber.startsWith("555")) {
                System.out.println("Start with: 555");
            } else {
                System.out.println("Doesn't start 555");
            }

            // 7 - Проверить заканчивается ли номер документа на последовательность 1а2b
            if (documentNumber.toLowerCase().endsWith("1a2b")) {
                System.out.println("Ends with 1а2b");
            } else {
                System.out.println("Doesn't end with 1а2b");
            }
        }


       // Вывести буквы в формате "Letters: yyy/yyy/y/y" в верхнем регистре
    public static void originalDocument(String documentNumber){
        String latters = documentNumber;
        StringBuilder latter = new StringBuilder();
        for (int i = 0; i < latters.length(); i++) {
            char c = latters.charAt(i);
            if (Character.isLetter(c)) {
                latter.append(c);
            }
        }
        System.out.println("Letters: " + latter.toString().toUpperCase());

    }



    }






