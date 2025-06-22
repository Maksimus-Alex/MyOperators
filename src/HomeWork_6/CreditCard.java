package HomeWork_6;

public class CreditCard {
    String bankName;
     long bankAccountNumber;
     long bankAccountDebit;

    public CreditCard(String name, long accountNum, long debit){
        bankName = name;
        bankAccountNumber = accountNum;
        bankAccountDebit = debit;
    }
    public void getCreditCard(){
        System.out.println("Your Bank name is: " + bankName);
        System.out.println("Your Account Number is: " + bankAccountNumber);
        System.out.println("Your Balance: " + bankAccountDebit);
    }
    public void addMoney(long money){
        this.bankAccountDebit += money;
    }

    public void takeMoney(long money) {
        this.bankAccountDebit -= money;
    }
    public long getBalance(){
        return this.bankAccountDebit;
    }



}
