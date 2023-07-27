public class Order {
    // 클래스 정의
    private String menu;
    private int count;
    private int orderPrice;

    // 생성자 정의
    public Order(String menu, int count, int price){
        this.menu = menu;
        this.count = count;
        setOrderPrice(price);
    }

    // orderPrice에 대한 set get 메소드 생성
    public void setOrderPrice(int price){
        orderPrice = price * count;
    }

    public int getOrderPrice(){
        return this.orderPrice;
    }

}
