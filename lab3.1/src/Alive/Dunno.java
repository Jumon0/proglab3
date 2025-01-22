package Alive;

import enums.Places;
import enums.Mood;
import interfaces.Recognizable;
import interfaces.Teasable;
import exceptions.InvalidMoodTransitionException;
import exceptions.InvalidPlaceException;

public class Dunno extends Shorties implements Recognizable, Teasable {
    public Dunno() throws InvalidPlaceException, InvalidMoodTransitionException {
        super("Незнайка", 18, Places.ZOO);
    }

    @Override
    public void tease(Creature creature) {
        System.out.println(getName() + " дразнит " + creature.getName() + ", тыкая в морду волшебной палочкой");
    }

    @Override
    public void recognize(Creature creature) {
        System.out.println(getName() + " сразу узнает " + creature.getName() + ", как только встретит");
    }


    @Override
    public String toString() {
        return "Коротышка по имени " + getName() + ", возрастом " + getAge() + ", находится в " + getPlace() + ".";
    }

    @Override
    protected void validateMood(Mood mood) throws InvalidMoodTransitionException {
        if(mood != Mood.HAPPY && mood != Mood.EXCITED && mood != Mood.SCARED && mood != Mood.NORMAL){
            throw new InvalidMoodTransitionException("Незнайка не может чувствовать себя " + mood);
        }
    }

    @Override
    protected void validatePlace(Places place) throws InvalidPlaceException {
        if(place != Places.ZOO && place != Places.CIRCUS && place != Places.NEARCAGE){
            throw new InvalidPlaceException("Незнайка не может находиться в " + place);
        }
    }
}