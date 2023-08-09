package lotto;

import java.util.Scanner;
import java.util.Set;

public class RunLotto {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        Lotto lotto = new Lotto();
        LottoBot lottoBot = new LottoBot();

        while(true) {
            System.out.println("로또를 몇개 생성하시겠습니까?");
            int lnum = scanner.nextInt();
            lottoBot.createLotto(lnum);
//			lottoBot.show();
            for (Set<Integer> s : lottoBot.getLottos()) {
                int rat = lotto.checkLotto(s);
                if (rat >= 5) {
                    System.out.println("꽝!");
                } else {
                    System.out.println(rat+ " 등!");
                }
            }
        }
    }

}
