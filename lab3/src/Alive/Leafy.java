package Alive;

import Enums.Places;

public class Leafy extends Shorties{
    public Leafy() {
        super("Листик",18, Places.CIRCUS);
    }

    public Leafy(String name, int age, Places place) {
        super(name, age, place);
    }

    @Override
    public String toString() {
        return "Коротышка по имени: " + getName() + ", возрастом " + getAge() + ", находится в " + getPlace();
    }
}
