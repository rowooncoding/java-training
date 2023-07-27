import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

public class Kiosk {
    // 키오스크 클래스 정의
    public static int key = 3;
    private int inventory;

    // 생성자 정의
    public Kiosk(int inventory){
        this.inventory = inventory;
    }

    // isInventory, subInventory 메소드 생성
    public boolean isInventory(int count){
        if(inventory > count){
            return true;
        }else{
            return false;
        }
    }

    public void subInventory(int count){
        inventory -= count;
        System.out.println(inventory);
    }

    // initOrder 메소드 생성
    public Order initOrder(String menu, int count){
        int price = 0;

        // 가격 설정
        if (menu.equals("딸기요거트")){
            price = 4500;
        } else if (menu.equals("카페라떼") || menu.equals("밀크티")){
            price = 3500;
        } else if (menu.equals("아메리카노")){
            price = 2000;
        } else {
            price = 0;
        }

        // 없는 메뉴 확인
        if(price == 0){
            System.out.println("없는 메뉴임");
            return null;
        }

        // 재고 확인 후 주문 진행
        if(isInventory(count)){
            // 재고 개수 업데이트
            subInventory(count);

            // order 클래스로 값들 반환
            Order order = new Order(menu, count, price);
            return order;
        }else{
            // 재고가 없는 경우
            System.out.println("재고가 부족합니다.");
            return null;
        }


    }






}





