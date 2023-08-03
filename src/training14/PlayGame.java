package training14;

import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("플레이어수와 사다리 층수를 입력해 주세요");
        int playerNum = scanner.nextInt();
        int floor = scanner.nextInt();

        Ladder ladder = new Ladder(playerNum, floor);
        ladder.show();


        System.out.println("플레이어수만큼 등수를 정해주세요");
        int[] rank = new int[playerNum];
        for (int i = 0; i < playerNum; i++) {
            rank[i] = scanner.nextInt();
        }
        ladder.setRank(rank);

        for (int i = 0; i < playerNum; i++) {
            Player player = new Player(i);
            int rat = player.runLadder(ladder.lMap, ladder.rank);
            System.out.println(i+1+"번째 플레이어 의 등수는 " + rat);
        }

        scanner.close();
    }

}