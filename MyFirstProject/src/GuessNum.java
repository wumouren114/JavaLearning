import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;
        int count = 0;
        int guess = 0;
        do {
            System.out.print("输入一个数字");
            guess = Integer.parseInt(sc.nextLine());
            count++;

            if (guess > answer) {
                System.out.println("大了");
            } else if (guess < answer) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了");
            }
        } while (guess != answer);

        System.out.println("你一共猜了" + count + "次");
        sc.close();
    }
}
