public class HereOrder extends Order{
    private int orderNum;

    public HereOrder(String menu, int count, int price) {
        super(menu, count, price);
        // TODO Auto-generated constructor stub
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public boolean runOrder(int deposit) {
        int change = deposit - orderPrice;
        if (change >= 0) {
            System.out.println("잔돈 "+change+"입니다. ");
            System.out.print(orderNum+ " 주문번호로 ");
            System.out.println(menu + " 주문 완료 되었습니다.");
            return true;
        } else {
            System.out.println("금액이 부족합니다.");
            return false;
        }
    }

}