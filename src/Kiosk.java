public class Kiosk {
    // 키오스크 클래스 정의
    public static int key = 3;
    private int inventory;

    // 생성자 정의
    public Kiosk(int inventory){
        this.inventory = inventory;
    }

    // isInventory, subInventory 메소드 생성
    public boolean isInventory(int count){
        if(inventory > count){
            return true;
        }else{
            return false;
        }
    }

    public void subInventory(int count){
        inventory -= count;
        System.out.println(inventory);
    }







}





