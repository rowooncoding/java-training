import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // 키오스크 키
        System.out.println("키오스크 키를 입력해주세요");
        int key = scanner.nextInt();

        // 매장 재고개수 입력
        System.out.println("매장 재고개수를 입력해주세요");
        int inventory = scanner.nextInt();

        // 총가격 출력 위해서 키오스크 클래스 인스턴스화
        Kiosk kiosk = new Kiosk(inventory);

        // 키와 매장 재고개수 확인 후 일치하면 주문 진행
        if(key == Kiosk.key){
            while(true){
                // 메뉴와 개수 입력
                System.out.println("메뉴와 개수를 입력해주세요");
                String menu = scanner.next();
                int count = scanner.nextInt();

                // 총 가격 출력
                Order order = kiosk.initOrder(menu, count);

                // 없는 메뉴 validation
                if(order == null){
                    continue;
                }

                // 음료값 지불
                int cash = scanner.nextInt();
                order.runOrder(cash);





            }
        }



    }





}