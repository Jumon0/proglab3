package interfaces;

import Alive.Creature;
import enums.Places;

public interface Stoppable {
    void stop(Places place, Creature creature);
}