package ua.ithillel.java;

public class AutoTransform {
    public static void main(String[] args) {

        int i;
        float f;

        i = 2_147_483_647;
        f = i;

        System.out.println("Значение до преобразования: " + i);
        System.out.println("Значение после авто преобразования \"int\" в \"float\": " + f);

    }
}
