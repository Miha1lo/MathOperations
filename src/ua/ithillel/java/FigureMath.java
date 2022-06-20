package ua.ithillel.java;

public class FigureMath {

    int side;
    String massage = "Периметр равен площади: ";

    int perimeter() {
        return 4 * side;
    }

    int square() {
        return side * side;
    }

    boolean isEqual() {
        return perimeter() == square();
    }
}
