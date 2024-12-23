package Alive;

import Enums.Places;
import Interfaces.Movable;
import Interfaces.Searchable;
import Interfaces.Stoppable;


public class Shorties extends Creature implements Searchable, Movable, Stoppable {
    public Shorties() {
        super("Коротышки",18, Places.ZOO);
    }

    public Shorties(String name, int age, Places place) {
        super(name, age, place);
    }
    @Override
    public void search(Creature creature, Places place) {
        System.out.println(getName() + " ищут персонажа по имени " + creature.getName() + " в " + place);
    }
    @Override
    public void walk() {
        System.out.println(getName() + " направились к выходу ");
    }
    @Override
    public void stop(Places place, Creature creature) {
        System.out.println(getName() + " остановились у " + place + " чтобы посмотреть на " + creature.getName());
    }

    @Override
    public String toString() {
        return getName() + " находятся в " + getPlace();
    }
}