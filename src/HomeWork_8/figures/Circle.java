package HomeWork_8.figures;

public class Circle extends Figures {
    //  S = π * r²
    // C = 2 · π · r
    private double r;

    public Circle(double r){
        this.r = r;
    }
    @Override
    public double perimeter(){
        return 2*3.14*r;
    }
    @Override
    double area(){
        return 3.14*r*r;
    }
}
