package Alive;

import Enums.Places;
import Enums.Mood;
import Interfaces.Movable;
import Interfaces.Searchable;
import Interfaces.Stoppable;
import Exceptions.InvalidMoodTransitionException;
import Exceptions.InvalidPlaceException;

public class Shorties extends Creature implements Searchable, Movable, Stoppable {
    public Shorties() throws InvalidPlaceException, InvalidMoodTransitionException {
        super("Коротышки", 18, Places.ZOO);
    }

    public Shorties(String name, int age, Places place) throws InvalidPlaceException, InvalidMoodTransitionException {
        super(name, age, place);
    }

    @Override
    public void search(Creature creature, Places place) {
        System.out.println(getName() + " ищут персонажа по имени " + creature.getName() + " в " + place);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " направились к выходу ");
    }

    @Override
    public void stop(Places place, Creature creature) {
        System.out.println(getName() + " остановились у " + place + " чтобы посмотреть на " + creature.getName());
    }

    @Override
    public String toString() {
        return getName() + " находятся в " + getPlace();
    }

    @Override
    protected void validateMood(Mood mood) throws InvalidMoodTransitionException {
        if(mood != Mood.HAPPY && mood != Mood.SAD && mood != Mood.EXCITED && mood != Mood.NORMAL){
            throw new InvalidMoodTransitionException("Коротышки не могут чувствовать себя " + mood);
        }
    }

    @Override
    protected void validatePlace(Places place) throws InvalidPlaceException {
        if(place != Places.CIRCUS && place != Places.ZOO && place != Places.CAGE && place != Places.NEARCAGE){
            throw new InvalidPlaceException("Коротышки не могут находиться в " + place);
        }
    }
}