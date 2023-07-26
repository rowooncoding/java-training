import java.util.Scanner;

public class training03 {
    public static void main(String[] args) {
        // 음료 입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("음료 메뉴 입력");
        String drink = scanner.next();

        int berry = 4500;
        int milktea = 3500;
        int cafelatte = 3500;
        int americano = 2000;

        switch(drink) {
            case"딸기요거트":{
                System.out.println(drink + "는 " + berry + "입니다.");
            }
            break;
            case"밀크티":{
                System.out.println(drink + "는 " + milktea + "입니다.");
            }
            break;
            case"카페라떼":{
                System.out.println(drink + "는 " + cafelatte + "입니다.");
            }
            break;
            case"아메리카노":{
                System.out.println(drink + "는 " + americano + "입니다.");
            }
            break;
            default:{
                System.out.println("메뉴가 없습니다.");
            }
            break;
        }

        // 잔돈입력
        System.out.print("금액을 입력해주세요 : ");
        int cash = scanner.nextInt();

        if(cash >= 4500) {
            System.out.println("잔돈" + (berry - cash) + "입니다.");
        }else if(cash >= 3500) {
            System.out.println("잔돈" + (milktea - cash) + "입니다.");
        }else if(cash >= 3500) {
            System.out.println("잔돈" + (cafelatte - cash) + "입니다.");
        }else if(cash >= 2000) {
            System.out.println("잔돈" + (americano - cash) + "입니다.");
        }else {
            System.out.println("금액이 부족합니다.");
        }

        scanner.close();

    }
}
