package Alive;

import Enums.Places;
import Interfaces.Recognizeable;

public class Dunno extends Shorties implements Recognizeable {
    public Dunno() {
        super("Незнайка", 18, Places.ZOO);
    }
    public Dunno(String name, int age, Places place) {
        super(name, age, place);
    }

    public void tease() {
        System.out.println(getName() + " дразнит обезьяну, тыкая в её морду волшебной палочкой!");
    }
    public void scared() {
        System.out.println("Незнайка оторопел");
    }
    @Override
    public void recognize(Creature creature) {
        System.out.println(getName() + " сразу узнает " + creature.getName() + ", как только увидит ");
    }
    @Override
    public String toString() {
        return "Коротышка по имени " + getName() + ", возрастом " + getAge() + ", находится в " + getPlace() + ".";
    }
}