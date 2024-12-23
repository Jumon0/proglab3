package Alive;

import Enums.Places;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dunno dunno = new Dunno();
        Monkey monkey = new Monkey();
        Leafy leafy = new Leafy();
        Shorties shorties = new Shorties();
        ArrayList<Donkey> donkeys = new ArrayList<>();
        donkeys.add(new Donkey("Брыкун", 18, Places.CIRCUS));
        donkeys.add(new Donkey("Пегасик", 18, Places.CIRCUS));
        donkeys.add(new Donkey("Калигула", 18, Places.CIRCUS));
        System.out.println(shorties);
        System.out.println(leafy);
        shorties.search(leafy, Places.ZOO);
        for (Donkey donkey : donkeys) {
            dunno.recognize(donkey);
        }
        shorties.walk();
        shorties.stop(Places.CAGE, monkey);
        dunno.tease(monkey);
        monkey.getsAngryAt(dunno);
        dunno.scared();

    }
}