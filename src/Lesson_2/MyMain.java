package Lesson_2;

public class MyMain {
    public static void main(String[] args){
        //Если это метод то всегда должен начинаться с глагола




        // Обьявление собственного метода
    }
    public static void getBasicVariableInfo(){
        // Variables
        // Operators
        // CastingMore actions
        // Formatters
        // Escape sequences

        // Variable - это ячейка внутри операционной памяти вашего компьютера, где временно хранится что-то
        //Большинство ваших переменных хранится в RAM - Randomly Accessed Memory - ОПЕРАТИВКА

        System.out.println("My name is: Maksim");
        System.out.println("My surname is: Aleakseichyk");
        System.out.println("My age is: 26");
        System.out.println("My profession is: Military");

        //целочисленное значение
        // LowerCameCase
        // Строгий язык программировани
        // то естcnm Java - Строгая Типизация - Ключевое слово предопределяет...
        // ... значее которое можно в нем сохранить
        // signed and unsigned valuesMore actions
        // Java нет возможности создать переменные только с минусом (0 и меньше) или только с плюсом (0 и выше)


        byte myByteValue = 19; // зачем нужны byte/short это для того, чтобы работали коды написанные ранее
        short myShortValue = 29456;
        int myIntValue = -1000000;
        long myLongNumber = -35L; // Говорит компилятору, я знаю что ты выделяешь память под ЛОНГ и ЭТО ПРАВИЛЬНО

        char letter = 'A'; // только один символ -> это целочисленная переменная
        // Таблица ASCII- числовое значе представление символов


        // значение с плавающей запятой
        float myFloatNumber = 45.567F;// 4 байта , для компилятора любое число с плавающей точкой - это double
        double myDoubleFloat = 456.184758940;// 8 байтов

        // Логическая переменная
        boolean isMarried = true; // правда
        boolean isEmploved = false; // Ложь
        boolean turnOnLamp = true;

        // ссылочне типы
        String myName = "Maksim";// String - пишется с большой буквы -это КЛАСС
        String mySurname = "Aleakseichyk";




    }

    public static void showVariableOutput(){
        String name = "Maksim";
        String surname = "Aleakseichyk";
        int age = 26;
        String profession = "Military";
        char prefix = 'A';
        boolean isEmploved = true;


        System.out.println("Your name is " + name);
        System.out.println("Your surname is " + surname);
        System.out.println("Your age is " + age);
        System.out.println("Your prifix is " + prefix);
        System.out.println(" Are you employed " + isEmploved);
        System.out.println(" Your profession is " + profession);

    }

    public static void getMemoryInformation(){

        // In RAM - есть два пространства для хранения данных
        // КРАТКОСРОЧНАЯ ПАМЯТЬ - STACK перевода нет
        // ДОЛГОСЧРОНАЯ ПАМЯТЬ - КУЧА / HEAP

        // STACK - хранятся все примитивные типы данных и они появляются, удаляются
        // удаление происходит тогда, когда переменная перестает использоваться
        // КУЧА / HEAP хранит данные до тех пор, пока ваш Java Garbage Collector (Сборщик Мусора)
        // Не решит, что пора оптимизировать память  и зачистить концы

        int age = 4; // int - 4 bytes STACK, behind age -> address for the MACHINE

        // Вопрос о том, как в Джава хранятся данные
        // поделили переменные на две категории
        // 1. ПРИМИТИВНЫЕ, ALL except STRING
        // 2. ССЫЛОЧНЫЕ, STRING - ОБЪЕКТЫ В ДЖАВА МОГУТ ХРАНИТЬСЯ ТОЛЬКО В КУЧУ!!!!
    }

}
