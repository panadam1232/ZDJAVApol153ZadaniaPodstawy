package pl.sdacademy.java.basic.excercises.day3.task7;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Filemon");
        cats[1] = new Cat("Bonifacy");
        cats[2] = new Cat("Mruczek");

        int mice = 5;
        for (Cat cat: cats ){
            System.out.println(cat.toString());
            System.out.println(cat);
            cat.print();
            cat.makeSound();
            cat.eatMice(mice++ * mice);
            System.out.println("***");
        }

    }
}
