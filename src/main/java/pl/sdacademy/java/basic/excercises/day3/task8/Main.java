package pl.sdacademy.java.basic.excercises.day3.task8;

public class Main {

    public static void main(String[] args) {
        Poem[] poems = new Poem[3];
        poems[0]= new Poem(new Author("Pisarczyk", "Poland"), 79);
        poems[1]= new Poem(new Author("Tuwim", "England"), 7);
        poems[2]= new Poem(new Author("Merkel", "Germany"), 9);

        Author authorMaxStropheNumbers = maxStropheNumbers(poems);
        System.out.println(authorMaxStropheNumbers);
    }
    private static Author maxStropheNumbers (Poem[] poems){
        int maxStropheNumbers = Integer.MIN_VALUE;
        Author author = null;

        for (Poem poem : poems) {
            if (poem.getStropheNumbers() > maxStropheNumbers){
                maxStropheNumbers = poem.getStropheNumbers();
                author = poem.getCreator();
            }
        }
        return author;
    }
}
