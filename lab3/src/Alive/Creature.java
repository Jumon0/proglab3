package Alive;

import Enums.Places;

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
}
