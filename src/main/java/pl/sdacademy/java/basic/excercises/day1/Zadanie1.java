package pl.sdacademy.java.basic.excercises.day1;

/*
Napisz program, który wyświetli na ekranie wyraz SDA, nie używając ani jednego znaku " lub '.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        //decimal
        decimal();

        System.out.println();

        //hex - 16stkowy zapis
        hexagonal();

        System.out.println();

        //binary
        binary();
    }

    private static void binary() {
        char s2 = 0b01010011;
        char d2 = 0b01000100;
        char a2 = 0b01000001;
        System.out.print(s2);
        System.out.print(d2);
        System.out.print(a2);
    }

    private static void hexagonal() {
        char s1 = 0x53;
        char d1 = 0x44;
        char a1 = 0x41;
        System.out.print(s1);
        System.out.print(d1);
        System.out.print(a1);
    }

    private static void decimal() {
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
}
