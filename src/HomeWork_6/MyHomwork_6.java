package HomeWork_6;

import java.util.Random;
import java.util.Scanner;

public class MyHomwork_6 {

    public static void main(String[] args) {
        createCreditCard();
    }
    public static void createCreditCard(){
        CreditCard mtb = new CreditCard("MTb",46312579468L, 1788);
        mtb.getCreditCard();

        System.out.println("*******************");
        CreditCard btb = new CreditCard("BTB",89766547L,1876);
        btb.getCreditCard();

        System.out.println("*******************");
        CreditCard belarusBank = new CreditCard("BelarusBank", 124579416385L, 2000);
        belarusBank.getCreditCard();

        System.out.println("*******************");

        mtb.addMoney(126);
        btb.addMoney(5567);
        belarusBank.takeMoney(245);

        System.out.println("After operations: ");
        System.out.println("-Balance MTB: " + mtb.getBalance());
        System.out.println("-Balance BTB: " + btb.getBalance());
        System.out.println("-Balance BelarusBANK: " + belarusBank.getBalance());
    }


}
