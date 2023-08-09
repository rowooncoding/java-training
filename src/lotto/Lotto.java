package lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
    private Set<Integer> win;

    public Lotto() {
        win = new HashSet<Integer>();
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        while (win.size()<6) {
            int randInt = random.nextInt(46);
            win.add(randInt);
        }
    }

    public int checkLotto(Set<Integer> lotto) {
        int count = 0;
        for (int i : lotto) {
            if (win.contains(i)) {
                count++;
            }
        }
        if (count >= 6) {
            return 1;
        } else if (count >= 5) {
            return 2;
        } else if (count >= 4) {
            return 3;
        } else if (count >= 3) {
            return 4;
        } else {
            return 5;
        }
    }
}
