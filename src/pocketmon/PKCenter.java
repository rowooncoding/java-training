package pocketmon;

import java.util.*;

public class PKCenter {
    protected PKArchive pkA;
    protected String[] pks = {"파이리","꼬북이","이상해씨"};

    public PKCenter(PKArchive pkArchive) {
        this.pkA = pkArchive;
    }

    protected void setAppearPk(String[] pks) {
        this.pks = pks;
    }


    public PoketMon initPk(){
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int i = random.nextInt(pks.length);
        String pkName = pks[i];

        Map<String, Object> baseStat = new HashMap<String, Object>();
        baseStat.putAll(pkA.pkMap.get(pkName));
        baseStat.put("pkName", pkName);

        return new PoketMon(initStat(baseStat),
                initSkill(pkName));
    }

    public Map<String, Object> initStat(Map<String, Object> baseStat) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int hp = (int) baseStat.get("hp");
        int power = (int) baseStat.get("power");
        int speed = (int) baseStat.get("speed");

        baseStat.replace("hp", hp + random.nextInt(20)-10);
        baseStat.replace("power", power + random.nextInt(20)-10);
        baseStat.replace("speed", speed + random.nextInt(20)-10);

        return baseStat;
    }

    public Map<String, Integer> initSkill(String pkName) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        String type = (String) pkA.pkMap.get(pkName).get("type");
        List<String> skills = pkA.typeSkill.get(type);
        Map<String,Integer> skill = new HashMap<String, Integer>();
        while (skill.size() < 2) {
            int i = random.nextInt(skills.size());
            String sName = skills.get(i);
            if (!skill.containsKey(sName)) {
                skill.put(sName, pkA.skillMap.get(sName));
            }
        }
        return skill;

    }

    public void pvp(PoketMon pk1, PoketMon pk2) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        while (true) {
            if(pk1.getSpeed() >= pk2.getSpeed()) {
                if(!pk2.damaged(attack(pk1, random))) {
                    System.out.println(pk1.name+ "의 승리!");
                    break;
                }
                if(!pk1.damaged(attack(pk2, random))) {
                    System.out.println(pk2.name+ "의 승리!");
                    break;
                }
            }else {
                if(!pk1.damaged(attack(pk2, random))) {
                    System.out.println(pk2.name+ "의 승리!");
                    break;
                }
                if(!pk2.damaged(attack(pk1, random))) {
                    System.out.println(pk1.name+ "의 승리!");
                    break;
                }
            }
        }
    }

    private int attack(PoketMon pk, Random random) {

        Map<String,Integer> skill = pk.getSkill();
        List<String> sList = new ArrayList<String>(skill.keySet());

        int i = random.nextInt(sList.size());
        int skillD = skill.get(sList.get(i));
        int deal =  (int) (skillD * (pk.getPower()*0.01));
        System.out.print(pk.name+ "의 ");
        System.out.println(sList.get(i)+" 공격!");
        return deal;
    }
}