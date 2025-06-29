package HomeWork_8.figures;

public class circle extends figures{
    //  S = π * r²
    // C = 2 · π · r
    private double r;

    public circle(double r){
        this.r = r;
    }
    @Override
    double perimeter(){
        return 2*3.14*r;
    }
    @Override
    double area(){
        return 3.14*r*r;
    }
}
