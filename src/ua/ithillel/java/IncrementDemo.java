package ua.ithillel.java;

public class IncrementDemo {
    public static void main(String[] args) {

        byte b;

        b = 127;
        System.out.println(b);

        b = ++b;
        System.out.println(b);

        b = b++;
        System.out.println(b);

        b = --b;
        System.out.println(b);

        b = b--;
        System.out.println(b);
    }
}
