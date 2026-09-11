import java.util.Scanner;

public class logincheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("用户名:");
        String user =sc.nextLine();
        System.out.print("密码：");
        String pwd = sc.nextLine();

        if (user.equals("wumouren114") && pwd.equals("123456")) {
            System.out.println("登陆成功，欢迎回来！");
        } else {
            System.out.println("用户名或密码名错误");
        }
        sc.close();
    }
}
