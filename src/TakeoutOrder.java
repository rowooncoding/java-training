public class TakeoutOrder extends Order{
    private int time;
    public TakeoutOrder(String menu, int count, int price) {
        super(menu, count, price);
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public boolean runOrder(int deposit) {
        int change = deposit - orderPrice;
        if (change >= 0) {
            System.out.println("잔돈 "+change+"입니다. ");
            System.out.print(time+ " 분뒤 ");
            System.out.println(menu + " 포장주문 완료되었습니다.");
            return true;
        } else {
            System.out.println("금액이 부족합니다.");
            return false;
        }
    }

    @Override
    public void setOrderPrice(int price) {
        // TODO Auto-generated method stub
        this.orderPrice = price * count - 500;
        System.out.print("테이크 아웃은 500원 할인되어 ");
        System.out.println(orderPrice + "원 입니다.");
    }
}