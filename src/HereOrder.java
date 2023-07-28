public class HereOrder extends Order{
    protected int orderNum;

    public HereOrder(String menu, int count, int price) {
        super(menu, count, price);
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public boolean runOrder(int deposit) {
        int change = deposit - orderPrice;
        if (change >= 0) {
            System.out.print("잔돈 "+change+" 입니다 ");
            System.out.println(orderNum + " 주문번호로 " + menu + " 나왔습니다.");
            return true;
        } else {
            System.out.println("금액이 부족합니다.");
            return false;
        }
    }
}
