package Game;

import java.util.HashMap;

public class Player {
    public String name;
    protected int turnNumber;
    public HashMap<Integer, Integer> resources;

    public Player(String name, int turnNumber, HashMap<Integer, Integer> resources) {
        this.name = name;
        this.turnNumber = turnNumber;
        this.resources = resources;
    }
}
