package training14;

public class Ladder {
    public int[][] lMap;
    public int[] rank;
    private int playNum;
    private int floor;

    public Ladder(int playNum, int floor) {
        lMap = new int[floor][playNum];
        rank = new int[playNum];
        this.playNum = playNum;
        this.floor = floor;
        setLadder();
    }

    private void setLadder() {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        for (int i = 0; i < floor; i++) {
            for (int j = 0; j < playNum; j++) {
                lMap[i][j] = 0;
            }
            int ladder = random.nextInt(playNum-1);
            lMap[i][ladder] = 1;
            lMap[i][ladder+1] = 2;
        }
    }

    public void setRank(int[] rank) {
        this.rank = rank;
    }

    public void show() {
        for (int i = 0; i < floor; i++) {
            for (int j = 0; j < playNum; j++) {
                System.out.print(lMap[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
