import java.util.Scanner;

public class passwordcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入暗号");
        String secret = sc.nextLine();
        if (secret.equals("芝麻开门")) {
            System.out.println("== 判断：门开了");
        } else {
            System.out.println("== 判断；暗号错误");
        }
        sc.close();
    }
}
