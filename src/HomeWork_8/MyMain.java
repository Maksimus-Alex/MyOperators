package HomeWork_8;
import HomeWork_8.figures.*;

public class MyMain {
    public static void main(String[] args) {
        // создать массив из 5 фигур
        // вывести сумму периметров всех фигур
        figures[] figure = new figures[5];
        figure[0] = new triangle(7,9,4);
        figure[1] = new rectangle(10,4);
        figure[2] = new circle(9);
        figure[3] = new triangle(12,5,7);
        figure[4] = new circle(45);

        double sumPerimeter = 0;
        for (figures f : figure) {
            sumPerimeter += figure.length;
        }
        System.out.println("SUm all perimeter: " + sumPerimeter);

    }
}
