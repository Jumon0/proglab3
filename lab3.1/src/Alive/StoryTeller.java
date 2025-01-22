package Alive;

import java.util.List;

public class StoryTeller {
    public void describeState(Creature creature) {
        String description = creature.getName() + " находится в " + creature.getPlace() + " и чувствует себя " + creature.getMood() + ".";
        System.out.println(description);
    }

    public void describeAllStates(List<Creature> creatures) {
        System.out.println("-------------------------------------");
        for(Creature creature : creatures){
            describeState(creature);
        }
        System.out.println("=======================================");
    }
}