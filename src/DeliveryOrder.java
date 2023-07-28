public class DeliveryOrder extends Order{
    protected String locate;

    public DeliveryOrder(String menu, int count, int price) {
        super(menu, count, price);
    }

    public void setLocate(String locate){
        this.locate = locate;
    }

    @Override
    public boolean runOrder(int deposit) {
        int change = deposit - orderPrice;
        if (change == 0) {
            System.out.println(locate + " 주소로 ");
            System.out.println(menu + " 배달이 완료 되었습니다");
            return true;
        } else {
            System.out.println("금액이 부족합니다.");
            return false;
        }
    }

    @Override
    public void setOrderPrice(int price) {
        super.orderPrice = price * count;
        System.out.println("배달비 3000원이 추가되어");
        System.out.println(orderPrice + "원 입니다.");
        System.out.println("배달 주문은 정확한 금액을 결정 해주세요.");
    }
}