package pocketmon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class PKArchive {
        Map<String, Map> pkMap;
        Map<String, Integer> skillMap;
        Map<String, List> typeSkill;


        public PKArchive() {
            pkMap = new HashMap<String, Map>();
            skillMap = new HashMap<String, Integer>();
            typeSkill = new HashMap<String, List>();
        }

        public void setPk(String[] pks, String[] pkType, int[][] pkStat) {
            for (int i=0; i<pks.length; i++) {
                Map<String, Object> v = new HashMap<String, Object>();
                v.put("hp", pkStat[i][0]);
                v.put("power", pkStat[i][1]);
                v.put("speed", pkStat[i][2]);
                v.put("type", pkType[i]);
                pkMap.put(pks[i], v);
            }
        }

        public void setSkill(String[] skills, int[] skillPwoer, String[][] skillType) {
            typeSkill.put("물", new ArrayList<String>());
            typeSkill.put("불", new ArrayList<String>());
            typeSkill.put("풀", new ArrayList<String>());

            for (int i=0; i< skills.length; i++) {
                skillMap.put(skills[i], skillPwoer[i]);
                for (String t : skillType[i]) {
                    typeSkill.get(t).add(skills[i]);
                }
            }
        }

        public void show(){
            System.out.println(pkMap.toString());
            System.out.println(skillMap.toString());
            System.out.println(typeSkill.toString());
        }
    }

