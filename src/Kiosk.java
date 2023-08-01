public class Kiosk implements DeliveryOrder.OnDelivery, HereOrder.OnHere, TakeoutOrder.OnTakeout {
    public static int key = 3;
    private int inventory;

    public Kiosk(int inventory) {
        this.inventory = inventory;
    }

    public Order initOder(String menu, int count, int orderType) {
        int price = 0;

        if (menu.equals("딸기요거트")){
            price = 4500;
        } else if (menu.equals("카페라떼") || menu.equals("밀크티")){
            price = 3500;
        } else if (menu.equals("아메리카노")){
            price = 2000;
        } else {
            price = 0;
        }

        if (price == 0) {
            System.out.println("메뉴가 없습니다.");
            return null;
        }

        if (isInventory(count)) {
            if (orderType == 1) {
                DeliveryOrder order = new DeliveryOrder(menu, count, price);
                order.setOnDelivery(this);
                return order;
            } else if (orderType == 2){
                TakeoutOrder order = new TakeoutOrder(menu, count, price);
                order.setOnTakeout(this);
                return order;
            } else {
                HereOrder order = new HereOrder(menu, count, price);
                order.setOnHere(this);
                return order;
            }
        } else {
            System.out.println("재고가 부족합니다.");
            return null;
        }
    }

    private boolean isInventory(int count) {
        if (inventory >= count) {
            return true;
        } else {
            return false;
        }
    }

    public void subInventory(int count) {
        inventory -= count;
    }

    @Override
    public void successDelivery(String locate, String menu, int count) {
        System.out.print(locate + " 주소로 ");
        System.out.println(menu + " 배달 주문이 완료 되었습니다.");
        subInventory(count);
    }
    @Override
    public void successHere(int change, int orderNum, String menu, int count) {
        System.out.println("잔돈 "+change+"입니다. ");
        System.out.print(orderNum+ " 주문번호로 ");
        System.out.println(menu + " 주문 완료되었습니다.");
        subInventory(count);

    }
    @Override
    public void successTakeout(int change, int time, String menu, int count) {
        System.out.println("잔돈 "+change+"입니다. ");
        System.out.print(time+ " 분후 ");
        System.out.println(menu + " 포장주문 완료되었습니다.");
        subInventory(count);
    }

    class KioskException extends Exception{
        public int code;

        public KioskException(int code){
            this.code = code;
        }
    }

}