package Alive;

import Enums.Places;
import Enums.Mood;
import Interfaces.Angerable;
import Exceptions.InvalidMoodTransitionException;
import Exceptions.InvalidPlaceException;

public class Monkey extends Creature implements Angerable {
    public Monkey() throws InvalidPlaceException, InvalidMoodTransitionException {
        super("Обезьяна", 18, Places.CAGE);
    }

    public Monkey(String name, int age, Places place) throws InvalidPlaceException, InvalidMoodTransitionException {
        super(name, age, place);
    }

    @Override
    public void getsAngryAt(Creature creature) {
        System.out.println("Обезьяна сердито нахмурилась и выхватила палочку из рук у " + creature.getName());
    }

    @Override
    public String toString() {
        return "Обезьяна по имени: " + getName() + ", возрастом " + getAge() + ", находится в " + getPlace();
    }

    @Override
    protected void validateMood(Mood mood) throws InvalidMoodTransitionException {
        if(mood != Mood.NORMAL && mood != Mood.ANGRY){
            throw new InvalidMoodTransitionException("Обезьяна не может чувствовать себя " + mood);
        }
    }

    @Override
    protected void validatePlace(Places place) throws InvalidPlaceException {
        if(place != Places.CAGE){
            throw new InvalidPlaceException("Обезьяна не может находиться в " + place);
        }
    }
}