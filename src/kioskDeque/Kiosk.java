package kioskDeque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class Kiosk implements OnDelivery, OnHere, OnTakeout{
    public static int key = 3;
    private int inventory;
    private Deque<Order> orderQ;

    public Kiosk(int inventory) {
        this.inventory = inventory;
        orderQ = new LinkedList<Order>();
    }

    public Order initOder(List<Menu> menus, int orderType) throws KisokException {

        if (isInventory(menus.size())) {
            if (orderType == 1) {
                DeliveryOrder order = new DeliveryOrder(menus);
                order.setOnDelivery(this);
                return order;
            } else if (orderType == 2){
                TakeoutOrder order = new TakeoutOrder(menus);
                order.setOnTakeout(this);
                return order;
            } else {
                HereOrder order = new HereOrder(menus);
                order.setOnHere(this);
                return order;
            }
        } else {
            System.out.println("재고가 부족합니다.");
            throw new KisokException(102);
        }
    }

    public void offerOrder(Order order) {
        orderQ.offerLast(order);
    }

    public void outOrder() {
        if (orderQ.size() >= 3) {
            Order order = orderQ.pollFirst();
            order.outOrder();
        }
    }

    public void subInventory(int count) {
        inventory -= count;
    }

    private boolean isInventory(int count) {

        if (inventory >= count) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void successDelivery(String locate, List<Menu> menus) {
        System.out.println(locate + " 주소로 배달 주문이 완료 되었습니다.");
        System.out.print("주문 내역 : ");
        for (Menu m : menus) {
            System.out.print(m.name + " ");
        }
        System.out.println("");
        subInventory(menus.size());
    }
    @Override
    public void successHere(int change, int orderNum, List<Menu> menus) {
        System.out.println("잔돈 "+change+"입니다. ");
        System.out.println(orderNum+ " 주문번호로 주문 완료되었습니다.");
        System.out.print("주문 내역 : ");
        for (Menu m : menus) {
            System.out.print(m.name + " ");
        }
        System.out.println("");
        subInventory(menus.size());
    }
    @Override
    public void successTakeout(int change, int time, List<Menu> menus) {
        System.out.println("잔돈 "+change+"입니다. ");
        System.out.print(time+ " 분후 포장주문 완료되었습니다.");
        System.out.print("주문 내역 : ");
        for (Menu m : menus) {
            System.out.print(m.name + " ");
        }
        System.out.println("");
        subInventory(menus.size());
    }

    @Override
    public void outDelivery(String locate, List<Menu> menus) {
        System.out.println("-------------------------");
        System.out.println("주문 하신 "+menus.size() +"개 메뉴 ");
        System.out.println(locate + " 주소로 배달이 시작되었습니다.");
        System.out.println("-------------------------");

    }

    @Override
    public void outHere(int orderNum, List<Menu> menus) {
        System.out.println("-------------------------");
        System.out.println(orderNum + "번 고객님");
        System.out.println("주문 하신 "+menus.size() +"개 메뉴 나왔습니다.");
        System.out.println("-------------------------");
    }

    @Override
    public void outTakeout(int time, List<Menu> menus) {
        System.out.println("-------------------------");
        System.out.println("주문 하신 "+menus.size() +"개 메뉴 ");
        System.out.println(time +"분 지나 포장주문 나왔습니다.");
        System.out.println("-------------------------");

    }

}

class KisokException extends Exception {
    public int code;

    public KisokException(int code) {
        this.code = code;
    }
}