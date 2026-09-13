import java.util.Scanner;

public class TernaryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数");
        int num = sc.nextInt();

        String result = (num % 2 == 0)? "偶数" : "奇数";
        System.out.println(num + "是" + result);

        sc.close();
    }

}
