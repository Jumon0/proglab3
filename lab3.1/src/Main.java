package Alive;

import enums.Mood;
import enums.Places;
import exceptions.InvalidMoodTransitionException;
import exceptions.InvalidPlaceException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            Dunno dunno = new Dunno();
            Monkey monkey = new Monkey();
            Leafy leafy = new Leafy();
            Shorties shorties = new Shorties();
            Donkey donkeys = new Donkey();

            ArrayList<Creature> allCreatures = new ArrayList<>();
            allCreatures.add(dunno);
            allCreatures.add(monkey);
            allCreatures.add(leafy);
            allCreatures.add(shorties);
            allCreatures.add(donkeys);

            StoryTeller storyTeller = new StoryTeller();
            storyTeller.describeAllStates(allCreatures);

            shorties.search(leafy, Places.ZOO);
            dunno.recognize(donkeys);

            shorties.walk();
            shorties.setPlace(Places.NEARCAGE);
            dunno.setPlace(Places.NEARCAGE);

            storyTeller.describeAllStates(allCreatures);

            shorties.stop(shorties.getPlace(), monkey);

            dunno.tease(monkey);
            monkey.setMood(Mood.ANGRY);
            monkey.getsAngryAt(dunno);
            dunno.setMood(Mood.SCARED);
            storyTeller.describeAllStates(allCreatures);

        } catch (InvalidPlaceException | InvalidMoodTransitionException e) {
            System.out.println("Произошла ошибка при создании объектов: " + e.getMessage());
        }
    }
}