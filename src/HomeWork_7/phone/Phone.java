package HomeWork_7.phone;

public class Phone {
    private long number;
    private String model;
    private double weight;

    public Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public  String getIformationPhone() {
        return "Your Iformation Phone is: " + "\n" +
                "Phone number: " + this.number + "\n" +
                "Phone model: " + this.model + "\n" +
                "Phone weight: " + this.weight;

    }


}