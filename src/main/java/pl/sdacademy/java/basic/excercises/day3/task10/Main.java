package pl.sdacademy.java.basic.excercises.day3.task10;

public class Main {
    public static void main(String[] args) {
        Warrior playerOne = new Warrior("Krzysiek", 80, 1000);
        Warrior playerTwo = new Warrior("Maja", 160, 1000);

        playerOne.fight(playerTwo);
    }
}
