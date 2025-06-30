package HomeWork_8.figures;

public class Triangle extends Figures {
    // стороны треуголника
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // переиметр треугольника = сумма всех его сторон
    // а для того чтобы вычеслить площадь треугоьника по сторонам нужен полупериметр
    // кароче сначала найти периметр, разделить на 2 , затем подставить все под формулу
    // S = √(p(p - a)(p - b)(p - c))

    // периметр
    @Override
    public double perimeter(){
        return a+b+c;
    }
    @Override
    double area(){
        double h = perimeter()/2;
        // как корень квадратный то сделать ???
        // Math.sqrt
        return Math.sqrt(h*(h-a)*(h-b)*(h-c));
    }

}
