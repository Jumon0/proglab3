package Alive;

import Enums.Places;

public class Leafy extends Shorties{
    public Leafy() {
        super("Листик",18, Places.CIRCUS);
    }

    @Override
    public String toString() {
        return "Коротышка по имени: " + getName() + ", возрастом " + getAge() + ", находится в " + getPlace();
    }
}
