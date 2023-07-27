public class Order {
    // 클래스 정의
    private String menu;
    private int count;
    private int orderPrice;

    // 생성자 정의
    public Order(String menu, int count, int price){
        this.menu = menu;
        this.count = count;
        // 메소드를 통해 주문금액(orderPrice)할당
    }

}
