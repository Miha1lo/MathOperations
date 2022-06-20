package ua.ithillel.java;

public class TransformData {
    public static void main(String[] args) {

        byte b;
        short sh;
        int i;
        int num;
        long l;
        float f;
        double d;
        char ch;

        b = 127;
        sh = b;
        i = sh;
        l = i;

        System.out.println("Значение \"l\" после преобразования \"int\" в \"long\" : " + l);

        d = i;

        System.out.println("Значение \"d\" после преобразования \"int\" в \"double\" : " + d);

        f = sh;

        System.out.println("Значение \"f\" после преобразования \"short\" в \"float\" : " + f);

        d = f;

        System.out.println("Значение \"d\" после преобразования \"float\" в \"double\" : " + d);

        ch = 'A';
        num = ch;

        System.out.println("Значение \"num\" после преобразования \"char\" в \"int\" : " + num);

    }


}
