import java.util.Scanner;

public class MaxFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("第一个数");
        int max = sc.nextInt();
        for (int i = 2 ; i <= 5; i++) {
            System.out.println("第" + i + "个数");
            int x =sc.nextInt();
            if(x > max) {
                max = x;
            }
        }
        System.out.println("最大值是" + max);
        sc.close();
    }
}
