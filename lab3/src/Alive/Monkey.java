package Alive;

import Enums.Places;

public class Monkey extends Creature{
    public Monkey() {
        super("Обезьяна",18, Places.ZOO);
    }

    public Monkey(String name, int age, Places place) {
        super(name, age, place);
    }

    public void getsAngryAt(Creature creature) {
        System.out.println("Обезьяна сердито нахмурилась и выхватила палочку из рук у " + creature.getName());
    }

    @Override
    public String toString() {
        return "Обезьяна по имени: " + getName() + ", возрастом" + getAge() + ", находится в" + getPlace();
    }
}