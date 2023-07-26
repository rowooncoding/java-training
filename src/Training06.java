import java.util.Random;

public class Training06 {
    public static void main(String[] args) {
        // 로또 번호 뽑기
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());


        for(int i = 1 ; i <= 5 ; i++) {
            System.out.print(i + "번째 로또 뽑기 : ");
            for(int j = 1 ; j <= 6 ; j++) {
                int number = random.nextInt(46);
                System.out.print(number + " ");
            }
            System.out.println();
        }

        // 해쉬 셋 사용해서 중복없는 숫자 만들기
        //Random random = new Random();
        //Set<Integer> numbers = new HashSet<>();

        //while(numbers.size() < 6) {
        //int number = random.nextInt(46);
        //numbers.add(number);
        //}

        //System.out.print("로또 번호: ");
        //for(int number : numbers) {
        //System.out.print(number + " ");
        //}
    }
}
