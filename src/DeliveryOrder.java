public class DeliveryOrder extends Order{
    private String locate;
    OnDelivery onDelivery;

    public interface OnDelivery{
        void successDelivery(String locate, String menu);
    }

    public void setOnDelivery(OnDelivery onDelivery) {
        this.onDelivery = onDelivery;
    }

    public DeliveryOrder(String menu, int count, int price) {
        super(menu, count, price);
    }

    public void setLocate(String locate) {
        this.locate =locate;
    }

    @Override
    public boolean runOrder(int deposit) {
        int change = deposit - orderPrice;
        if (change == 0) {

            return true;
        } else {
            System.out.println("금액이 맞지 않습니다.");
            return false;
        }
    }

    @Override
    public void setOrderPrice(int price) {
        // TODO Auto-generated method stub
        this.orderPrice = price * count + 3000;
        System.out.print("배달비 3000원 추가되어 ");
        System.out.println(orderPrice + "원 입니다.");
        System.out.println("배달 주문은 정확한 금액을 결제해주세요");
    }

}