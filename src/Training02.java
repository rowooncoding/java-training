import java.util.Scanner;

public class Training02 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("초를 입력해주세요 => ");
        int number = scanner.nextInt();

        System.out.println("시간: "+(number/60)/60 + " 분: " + (number/60)%60 + " 초: " + (number % 60)+ "입니다.");

        scanner.close();

    }
}
