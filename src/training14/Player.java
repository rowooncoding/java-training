package training14;

public class Player {
    private int pNum;

    public Player(int pNum) {
        this.pNum = pNum;
    }

    public int runLadder(int[][] map, int[] rank) {
        int p =pNum;
        for (int i = 0; i < map.length; i++) {
            int go = map[i][p];
            if (go == 1) {
                p += 1;
            } else if (go == 2) {
                p -= 1;
            }
        }
        return rank[p];
    }
}
