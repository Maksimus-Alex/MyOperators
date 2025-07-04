package HomeWork_8;
import HomeWork_8.figures.*;
import HomeWork_8.Interface.*;

public class MyMain {
    public static void main(String[] args) {
    }

    public static void getFigures(){
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

    public static void printPosition(){
        Position director = new Director();
        Position worker = new Working();
        Position accountant = new Accountant();

        director.getPosition();
        worker.getPosition();
        accountant.getPosition();
    }
}
