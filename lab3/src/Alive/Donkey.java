package Alive;

import Enums.Places;

public class Donkey extends Creature {
    public Donkey() {
        super("Без имени",10, Places.CIRCUS);
    }

    public Donkey(String name, int age, Places place) {
        super(name, age, place);
    }

    @Override
    public String toString() {
        return "Осел-ветрогон по имени: " + getName() + ", возрастом " + getAge() + ", находится " + getPlace();
    }
}
