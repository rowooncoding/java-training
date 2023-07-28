public class TakeoutOrder extends Order {
    protected int time;
    public TakeoutOrder(String menu, int count, int price) {
        super(menu, count, price);
    }

    public void setTime(int time){
        this.time = time;
    }

    @Override
    public boolean runOrder(int deposit) {
        int change = deposit - orderPrice;
        if (change >= 0) {
            System.out.print("잔돈 "+change+" 입니다 ");
            System.out.println(time + "분 뒤 " + menu + " 포장주문 완료되었습니다.");
            return true;
        } else {
            System.out.println("금액이 부족합니다.");
            return false;
        }
    }

    @Override
    public void setOrderPrice(int price) {
        orderPrice = price * count - 500;
        System.out.println("테이크아웃은 오백원 할인되었습니다");
        System.out.println(orderPrice + "원 입니다.");
    }
}
