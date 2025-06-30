package HomeWork_8;
import HomeWork_8.figures.*;

public class MyMain {
    public static void main(String[] args) {
        // создать массив из 5 фигур
        // вывести сумму периметров всех фигур
        Figures[] figures = new Figures[5];
        figures[0] = new Triangle(7,9,4);
        figures[1] = new Rectangle(10,4);
        figures[2] = new Circle(9);
        figures[3] = new Triangle(12,5,7);
        figures[4] = new Circle(12);

        double sumPerimeter = 0;
        for (Figures f : figures) {
            sumPerimeter += f.perimeter();

        }
        System.out.println("Perimeter Figures 1: " + figures[0].perimeter());
        System.out.println("Perimeter Figures 2: " + figures[1].perimeter());
        System.out.println("Perimeter Figures 3: " + figures[2].perimeter());
        System.out.println("Perimeter Figures 4: " + figures[3].perimeter());
        System.out.println("Perimeter Figures 5: " + figures[4].perimeter());
        System.out.println("SUm all perimeter: " + sumPerimeter);

    }
}
