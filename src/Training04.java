import java.util.Scanner;

public class Training04 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 != number2) {
            if (number1 - number2 == -2 || number1 - number2 == 1) {
                System.out.println("a가 이김");
            } else if (number1 - number2 == 2 || number1 - number2 == -1) {
                System.out.println("b가 이겨");
            }
            else {
                System.out.println("비김");
            }
        }

        scanner.close();

    }
}
