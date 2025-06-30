package HomeWork_8.figures;

public class Rectangle extends Figures {
    // P = 2 * (a + b)
    // S = a × b
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double perimeter(){
        return a*b;
    }
    @Override
    double area(){
        return 2*(a+b);
    }


}
