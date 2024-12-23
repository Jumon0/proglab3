package Interfaces;

import Alive.Creature;
import Enums.Places;

public interface Stoppable {
    void stop(Places place, Creature creature);
}