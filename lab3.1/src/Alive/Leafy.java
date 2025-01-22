package Alive;

import enums.Places;
import enums.Mood;
import exceptions.InvalidMoodTransitionException;
import exceptions.InvalidPlaceException;

public class Leafy extends Shorties {
    public Leafy() throws InvalidPlaceException, InvalidMoodTransitionException {
        super("Листик", 18, Places.CIRCUS);
    }

    @Override
    public String toString() {
        return "Коротышка по имени: " + getName() + ", возрастом " + getAge() + ", находится в " + getPlace();
    }

    @Override
    protected void validateMood(Mood mood) throws InvalidMoodTransitionException {
        if(mood != Mood.HAPPY && mood != Mood.EXCITED && mood != Mood.NORMAL){
            throw new InvalidMoodTransitionException("Листик не может чувствовать себя " + mood);
        }
    }

    @Override
    protected void validatePlace(Places place) throws InvalidPlaceException {
        if(place != Places.CIRCUS && place != Places.ZOO){
            throw new InvalidPlaceException("Листик не может находиться в " + place);
        }
    }
}