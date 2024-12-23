package Alive;

import Enums.Places;
import Interfaces.Recognizable;
import Interfaces.Teasable;
import Interfaces.Scareable;

public class Dunno extends Shorties implements Recognizable, Teasable, Scareable {
    public Dunno() {
        super("Незнайка", 18, Places.ZOO);
    }

    @Override
    public void tease() {
        System.out.println(getName() + " дразнит обезьяну!");
    }

    @Override
    public void recognize(Creature creature) {
        System.out.println(getName() + " сразу узнает " + creature.getName() + ", как только встретит");
    }

    @Override
    public void scared() {
        System.out.println("Незнайка оторопел.");
    }

    @Override
    public String toString() {
        return "Коротышка по имени " + getName() + ", возрастом " + getAge() + ", находится в " + getPlace() + ".";
    }
}
