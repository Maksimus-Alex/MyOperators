package HomeWork_6;

public class MyHomwork_6 {

    public static void main(String[] args) {
        createCreditCard();
    }
    public static void createCreditCard(){
        CreditCard mtb = new CreditCard("MTb",46312579468L, 1788);
        mtb.getCreditCard();

        System.out.println("****************");
        CreditCard btb = new CreditCard("BTB",89766547L,1876);
        btb.getCreditCard();

        System.out.println("****************");
        CreditCard belarusBank = new CreditCard("BelarusBank", 124579416385L, 2000);
        belarusBank.getCreditCard();
    }
    public static void getMoney(){

    }

}
