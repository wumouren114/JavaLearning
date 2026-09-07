import java.util.Scanner;

public class Temp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入摄氏温度");
        int c = sc.nextInt();
        double f = 9.0 / 5 * c + 32;
        System.out.println("华氏温度是：" + f);
        sc.close();
    }
}
