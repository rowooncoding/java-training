package tetris;

import java.util.Random;
import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        System.out.println("블록이 들어갈 라인의 개수를 입력하세요");
        int lineNum = scanner.nextInt();

        BlockMap blockMap = new BlockMap(lineNum);


        while (true) {
            blockMap.showmap();
            int block = random.nextInt(lineNum*2)+1;
            System.out.println(block+" 블록이 들어갈 라인의 번호를 입력하세요");
            int onNum = scanner.nextInt();
            if (blockMap.onBlock(onNum, block)) {
                System.out.print(blockMap.getCount()+" 회 만에 ");
                System.out.println(onNum+" 라인이 꽉찼습니다.");
                blockMap.showmap();
                break;
            }

        }

    }

}
