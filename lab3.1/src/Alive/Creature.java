package Alive;

import Enums.Places;
import Enums.Mood;
import Exceptions.InvalidMoodTransitionException;
import Exceptions.InvalidPlaceException;
import java.util.Objects;

public abstract class Creature {
    private String name;
    private int age;
    private Places place;
    private Mood mood;

    public Creature(String name, int age, Places place, Mood mood) throws InvalidPlaceException, InvalidMoodTransitionException {
        setName(name);
        setAge(age);
        setPlace(place);
        setMood(mood);
    }

    public Creature(String name, int age, Places place) throws InvalidPlaceException, InvalidMoodTransitionException {
        this(name, age, place, Mood.NORMAL);
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

    public void setAge(int age){
        this.age = age;
    }

    public Places getPlace(){
        return place;
    }

    public void setPlace(Places place) throws InvalidPlaceException {
        validatePlace(place);
        this.place = place;
    }

    public Mood getMood(){
        return mood;
    }

    public void setMood(Mood mood) throws InvalidMoodTransitionException {
        validateMood(mood);
        this.mood = mood;
    }

    protected abstract void validateMood(Mood mood) throws InvalidMoodTransitionException;
    protected abstract void validatePlace(Places place) throws InvalidPlaceException;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Creature creature = (Creature) obj;
        return age == creature.age &&
                Objects.equals(name, creature.name) &&
                place == creature.place &&
                mood == creature.mood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, place, mood);
    }
}