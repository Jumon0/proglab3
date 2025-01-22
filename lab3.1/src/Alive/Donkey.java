package Alive;

import Enums.Places;
import Enums.Mood;
import Exceptions.InvalidMoodTransitionException;
import Exceptions.InvalidPlaceException;

public class Donkey extends Creature {
    public Donkey() throws InvalidPlaceException, InvalidMoodTransitionException {
        super("Ослы-ветрогоны", 10, Places.CIRCUS);
    }

    public Donkey(String name, int age, Places place) throws InvalidPlaceException, InvalidMoodTransitionException {
        super(name, age, place);
    }

    @Override
    public String toString() {
        return "Осел-ветрогон по имени: " + getName() + ", возрастом " + getAge() + ", находится в " + getPlace();
    }

    @Override
    protected void validateMood(Mood mood) throws InvalidMoodTransitionException {
        if(mood != Mood.NORMAL){
            throw new InvalidMoodTransitionException("Осел не может чувствовать себя " + mood);
        }
    }

    @Override
    protected void validatePlace(Places place) throws InvalidPlaceException {
        if(place != Places.CIRCUS && place != Places.ZOO){
            throw new InvalidPlaceException("Осел не может находиться в " + place);
        }
    }
}