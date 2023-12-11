package pl.sdacademy.java.basic.excercises.day1;

/*
Napisz program, który wypisze poniższy kawałek tabliczki mnożenia:
 5 x 1 = 5
 5 x 2 = 10
 5 x 3 = 15
 5 x 4 = 20
*  Zmodyfikuj  metodę,  tak  aby  wyświetlała  powyższy  kawałek  tabliczki  mnożenia  dla  zadanego
mnożnika i mnożnej (dwa parametry: od - do) zadanych jako parametry.
Przykład:
void printMultiplicationTable(int multiplier,int minMultiplicand, int maxMultiplicand)
multiplier = 6, multiplicandMin = 2, multiplicandMax =  5
 6 x 2 = 12
 6 x 3 = 18
 6 x 4 = 24
 6 x 5 = 30
 */
public class Zadanie6 {
    public static void main(String[] args) {
        tabliczka(6, 5, 2);
    }

    private static void tabliczka(int multiplier, int multiplicandMax, int multiplicandMin) {
        int sum;
        if (multiplier == 0 || multiplicandMax == 0) {
            System.out.println("Wpisano mnożnik x 0");
        }
        for (int i = 1; i < multiplier; i++) {
            if (i >= multiplicandMin && i <= multiplicandMax) {
                sum = multiplier * i;
                System.out.println(multiplier + " x " + i + " = " + sum);
            }
        }
    }
}
