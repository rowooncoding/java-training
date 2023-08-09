package pocketmon;

import java.util.HashMap;
import java.util.Map;

public class TaechoGym extends PKCenter{

    public TaechoGym(PKArchive pkArchive) {
        super(pkArchive);
        String[] pks = {"이상해씨"};
        setAppearPk(pks);
    }


    @Override
    public Map<String, Object> initStat(Map<String, Object> baseStat) {

        return baseStat;
    }

    @Override
    public Map<String, Integer> initSkill(String pkName) {
        Map<String,Integer> skill = new HashMap<String, Integer>();
        skill.put("몸통박치기", pkA.skillMap.get("몸통박치기"));
        skill.put("풀베기", pkA.skillMap.get("풀베기"));
        return skill;
    }
}
