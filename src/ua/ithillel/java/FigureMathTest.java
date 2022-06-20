package ua.ithillel.java;

public class FigureMathTest {
    public static void main(String[] args) {

        FigureMath figure1 = new FigureMath();

        figure1.side = 4;

        System.out.println(figure1.massage + figure1.isEqual());

        FigureMath figure2 = new FigureMath();

        figure2.side = 2;

        System.out.println(figure2.massage + figure2.isEqual());


    }
}
