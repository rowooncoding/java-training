package lotto;

import java.util.*;

public class LottoBot {
    private List<Set<Integer>> lottos;

    public LottoBot() {
        lottos = new ArrayList<Set<Integer>>();
    }

    public void createLotto(int lnum) {
        lottos.clear();
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        for (int i = 0; i < lnum; i++)	{
            Set<Integer> lset = new HashSet<Integer>();
            while (lset.size()<6) {
                int randInt = random.nextInt(46);
                lset.add(randInt);
            }
            lottos.add(lset);
        }
    }
    public List<Set<Integer>> getLottos() {
        return lottos;
    }

    public void show() {
        for (Set<Integer> set : lottos) {
            for(int i: set) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }

}
