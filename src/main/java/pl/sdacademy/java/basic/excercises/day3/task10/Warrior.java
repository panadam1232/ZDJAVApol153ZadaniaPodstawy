package pl.sdacademy.java.basic.excercises.day3.task10;

import java.util.Objects;

public class Warrior {
    private final String name;
    private final int strength;
    private int hp;

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHp() {
        return hp;
    }

    public Warrior(String name, int strength, int hp) {
        this.name = name;
        this.strength = strength;
        this.hp = hp;
    }
    private boolean isAlive() {
        if (this.hp > 0) {
            return true;
        } else {
            System.out.println(this.name + " is dead");
            return false;
        }
    }
    private void attack(int damage) {
        this.hp -= damage;
        System.out.println(this.name + " hp is: " + this.hp);
    }
    public void fight (Warrior warrior){
        while (this.isAlive() && warrior.isAlive()){
            warrior.attack(this.strength);
            this.attack(warrior.strength);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return strength == warrior.strength && hp == warrior.hp && Objects.equals(name, warrior.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, hp);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", hp=" + hp +
                '}';
    }
}
