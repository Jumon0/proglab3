package Alive;

import Enums.Places;
import java.util.Objects;
public abstract class Creature {
    private String name;
    private int age;
    private Places place;

    public Creature(String name, int age, Places place) {
        this.name = name;
        this.age = age;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Places getPlace() {
        return place;
    }

    public void setPlace(Places place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Creature creature = (Creature) obj;
        return age == creature.age &&
                Objects.equals(name, creature.name) &&
                place == creature.place;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, place);
    }
}
