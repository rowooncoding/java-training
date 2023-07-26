import java.util.Scanner;

public class Training07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            // 메뉴 입력
            System.out.print("메뉴를 입력해주세요 : ");
            String drink = scanner.next();

            // 프로그램 종료
            if(drink.equals("종료")) {
                System.out.println("프로그램 종료");
                break;
            }

            // 수량 입력
            System.out.print("원하시는 수량을 입력해주세요 : ");
            int quantity = scanner.nextInt();

            // 음료 가격
            int money = 0;

            // 음료당 가격 입력
            switch(drink) {
                case"딸기요거트":{
                    money = 4500;
                    break;
                }
                case"밀크티":{
                    money = 3500;
                    break;
                }
                case"카페라떼":{
                    money = 3500;
                    break;
                }
                case"아메리카노":{
                    money = 2000;
                    break;
                }
                default:{
                    System.out.println("메뉴가 없습니다.");
                    continue;
                }
            }

            // 총 가격
            int totalCash = money*quantity;
            System.out.println("총 가격은 " + totalCash + "입니다.");

            // 금액 입력
            System.out.print("금액을 입력 해주세요 : ");
            int cash = scanner.nextInt();

            if(cash >= totalCash) {
                System.out.println("잔돈" + (cash - totalCash) + "입니다.");
            }else {
                System.out.println("금액이 부족합니다.");
                continue;
            }

            for(int i = 1 ; i <= quantity ; i++) {
                System.out.println(drink + "나왔습니다.");
            }

        }
        scanner.close();
    }
}
