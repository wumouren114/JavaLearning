import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 50;
        int count = 0;
        int guess = 0;
        do {
            System.out.print("输入一个数字（共 7 次机会）：");
            guess = Integer.parseInt(sc.nextLine());
            count++;

            if (guess > answer) {
                System.out.println("大了");
            } else if (guess < answer) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了");
            }
        } while (guess != answer && count < 7);

        if (guess == answer) {
            System.out.println("恭喜，你用了" + count + "次猜中！" );
        } else {
            System.out.println("挑战失败，正确答案是" + answer);
        }
        sc.close();
    }
}
