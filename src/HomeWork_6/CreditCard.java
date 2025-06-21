package HomeWork_6;

public class CreditCard {
    String bankName;
    long bankAccountNumber;
    double bankAccountDebit;

    public CreditCard(String name, long accountNum, double debit){
        bankName = name;
        bankAccountNumber = accountNum;
        bankAccountDebit = debit;
    }
    public void getCreditCard(){
        System.out.println("Your Bank name is: " + bankName);
        System.out.println("Your Account Number is: " + bankAccountNumber);
        System.out.println("Your Balance: " + bankAccountDebit);
    }



}
