package pocketmon;

import java.util.Scanner;

public class RunGame {

    public static void main(String[] args) {
        String[] skills = {"몸통박치기", "할퀴기", "울부짖기", "하이드로펌프",
                "물대포", "파도타기", "불대문자", "니트로차지", "솔라빔", "풀베기"};
        int[] skillPwoer = {60, 50, 20, 100, 90, 90, 120, 70, 110, 80};
        String[][] skillType = {{"물", "불", "풀"}, {"불", "풀"}, {"물", "불", "풀"},
                {"물"}, {"물"}, {"물"}, {"불"}, {"불"}, {"풀"}, {"풀"}};

        String[] pks = {"꼬북이", "파이리", "이상해씨", "뚜벅초",
                "고라파덕", "가디"};
        String[] pkType = {"물", "불", "풀", "풀", "물", "불"};
        int[][] pkStat = {{250, 90, 90}, {150, 120, 90}, {200, 100, 90}, {150, 80, 80},
                {160, 80, 80}, {150, 90, 100}};

        Scanner scanner = new Scanner(System.in);

        PKArchive pkArchive = new PKArchive();
        pkArchive.setPk(pks, pkType, pkStat);
        pkArchive.setSkill(skills, skillPwoer, skillType);
        pkArchive.show();

        System.out.println("파이리, 꼬북이, 이상해씨중 플레이어의 포켓몬을 뽑습니다.");
        PKCenter pkCenter = new PKCenter(pkArchive);
        PoketMon myPkm = pkCenter.initPk();
        System.out.println(myPkm.getPkName() + "의 이름을 입력해주세요");
        String name = scanner.next();
        myPkm.setName(name);
        myPkm.show();

        TaechoField tcField = new TaechoField(pkArchive);
        TaechoGym tcGym = new TaechoGym(pkArchive);

        while (true) {
            System.out.println("무엇을 하시겠습니까?");
            System.out.println("1.사냥 2.도전 3.종료");
            int op = scanner.nextInt();
            if (op == 1) {
                PoketMon tcPk = tcField.initPk();
                System.out.println("야생의 " + tcPk.name + " 가 나타났다!");
                tcField.pvp(myPkm, tcPk);
                myPkm.fillHp();
            } else if (op == 2) {
                PoketMon tgPk = tcGym.initPk();
                System.out.println("풀 관장 " + tgPk.name + " 가 나타났다!");
                tcGym.pvp(myPkm, tgPk);
                myPkm.fillHp();

            } else {
                break;
            }
        }

    }
}