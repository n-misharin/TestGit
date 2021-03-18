package GameViews;

import Game.Field;
import Game.Player;
import Game.Worker;

public class GameWorker extends Worker implements Drawable{
    public String symbol = "W";

    public GameWorker(Field field, Player player) {
        super(field, player);
    }

    @Override
    public void draw() {
        System.out.print(symbol);
    }
}
