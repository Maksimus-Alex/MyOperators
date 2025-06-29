package HomeWork_8.figures;

public class rectangle extends figures {
    // P = 2 * (a + b)
    // S = a × b
    private double a;
    private double b;

    public rectangle( double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    double perimeter(){
        return a*b;
    }
    @Override
    double area(){
        return 2*(a+b);
    }


}
