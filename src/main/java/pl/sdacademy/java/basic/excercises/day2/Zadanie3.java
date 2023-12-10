package pl.sdacademy.java.basic.excercises.day2;

/*
Napisz program, który przyjmie jako parametry input oraz word (oba typu String), a następnie
sprawdzi czy word występujew input. Jeżelitak, wtedy wynikiem jest pozycja na którejzaczyna
sięword. Jeżelinie udałosięznaleźćszukanego tekstu wtedy wynikiem powinno być-1.
Przykład:
Input: Ala ma kota
Word: ma
Result: 4
Input: Ala ma kota
Word:
Result: -1
 */
public class Zadanie3 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";
        //result = 4

        int result = getIndex(input, word);
        System.out.println(result);

        input = "Ala ma kota";
        word = "";
        //result = -1

        result = getIndex(input, word);
        System.out.println(result);

    }

    public static int getIndex(String input, String word) {
        if (Utils.isValid(input) && Utils.isValid(word)) {
            //if (input.contains(word)) { -> w metodzie indexOf jeżeli nie znajdzie to domyślnie zwróci -1
                return input.indexOf(word);
            //}
        }
        return -1;
    }
}
