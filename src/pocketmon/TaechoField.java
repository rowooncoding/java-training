package pocketmon;

import java.util.Map;
import java.util.Random;

public class TaechoField extends PKCenter{

    public TaechoField(PKArchive pkArchive) {
        super(pkArchive);
        String[] pks = {"고라파덕","뚜벅초","가디"};
        setAppearPk(pks);
    }

    @Override
    public Map<String, Object> initStat(Map<String, Object> baseStat) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int hp = (int) baseStat.get("hp");
        int power = (int) baseStat.get("power");
        int speed = (int) baseStat.get("speed");

        baseStat.replace("hp", hp + random.nextInt(10)-5);
        baseStat.replace("power", power + random.nextInt(10)-5);
        baseStat.replace("speed", speed + random.nextInt(10)-5);

        return baseStat;

    }

}
