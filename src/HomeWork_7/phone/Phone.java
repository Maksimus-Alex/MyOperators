package HomeWork_7.phone;

public class Phone {
    private long number;
    private String model;
    private double weight;

    public Phone(long number, String model, double weight) { // конструктор с 3-мя параметрами
        this (number,model); // вызываем констуктор с 2 парамерами
        this.weight = weight;
    }
    public Phone(Long number, String model){ // Конструктор с двумя параметрами
        this.number = number;
        this.model = model;
    }
    public Phone(){} // конструктор с нулевыми параметрами

    public  String getIformationPhone() {
        return "Your Iformation Phone is: " + "\n" +
                "Phone number: " + this.number + "\n" +
                "Phone model: " + this.model + "\n" +
                "Phone weight: " + this.weight;

    }

    public void receiveCall(String name){
        System.out.println("Call " + name);
    }

    public long getNumber (){
        return this.number;
    }

    public void receiveCall(String name, long number){
        this.number = number;
        System.out.println("Call " + name + "\n" + "Number " + number);
    }




}