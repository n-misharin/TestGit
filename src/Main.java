import Game.Board;

public class Main {
    public static void main(String[] args) {
        int x = 10, y = 10;
        Board board = Board.getRandomBoard(x, y);
        for (int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                System.out.print(board.fields[i][j].getType() + "\t");
            }
            System.out.println();
        }
    }
}
