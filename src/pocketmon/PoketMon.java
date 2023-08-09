package pocketmon;

import java.util.Map;

public class PoketMon {
    public String name;
    public int hp;
    private Map<String,Object> stat;
    private Map<String,Integer> skill;


    public PoketMon(Map stat, Map skill) {
        this.stat = (Map<String, Object>) stat;
        this.skill = skill;
        this.name = getPkName();
        fillHp();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPkName() {
        return (String) stat.get("pkName");
    }

    public int getPower(){
        return (int) stat.get("power");
    }

    public int getSpeed() {
        return (int) stat.get("speed");
    }

    public Map<String,Integer> getSkill() {
        return skill;
    }

    public boolean damaged(int deal) {
        hp -= deal;
        if (hp > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void fillHp() {
        hp = (int) stat.get("hp");
    }

    public void show() {
        System.out.println(name+"이의 상태입니다.");
        System.out.println("현재 체력 "+ hp);
        System.out.println("능력창 "+ stat.toString());
        System.out.println("스킬창 "+ skill.toString());
    }
}
