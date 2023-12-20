package pl.sdacademy.java.basic.excercises.day3.task10;

public class Main {
    public static void main(String[] args) {
        Warrior playerOne = new Warrior("Krzysiek", 1234, 31400);
        Warrior playerTwo = new Warrior("Maja", 333, 124030);

        playerOne.fight(playerTwo);
    }
}
