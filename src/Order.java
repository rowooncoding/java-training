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

    // rundOrder 메소드 생성
    public boolean runOrder(int cash){
        if(cash > orderPrice){
            int change = cash - orderPrice;
            System.out.println("잔돈 " + change + "와 " + menu + "나왔습니다.");
            return true;
        }else{
            System.out.println("금액부족");
            return false;
        }
    }

    // orderPrice에 대한 set get 메소드 생성
    public void setOrderPrice(int price){
        orderPrice = price * count;
        // 총 가격 출력
        System.out.println(orderPrice);
    }

    public int getOrderPrice(){
        return this.orderPrice;
    }

}
