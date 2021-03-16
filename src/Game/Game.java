package Game;

import java.util.ArrayList;
import java.util.HashMap;

public class Game {
    protected ArrayList<Player> players;
    protected Board board;

    public Game(int playersCount, int boardSize) {
        this.players = new ArrayList<Player>();
        this.board = Board.getRandomBoard(boardSize, boardSize);

        for (int i = 0; i < playersCount; i++){
            HashMap<Integer, Integer> resources = new HashMap<>();
            resources.put(0, 100); // gold
            resources.put(1, 0);   // diamond
            resources.put(2, 0);   // oil
            Player player = new Player("player # " + i, i + 1, resources);
            this.players.add(player);
        }
    }
}
