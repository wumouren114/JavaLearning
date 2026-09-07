import java.util.Scanner;

public class ScannerTrap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的年龄:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("请输入你的名字:");
        String name = sc.nextLine();
        System.out.println("年龄:"+ age + ",名字:[" + name + "]");
        sc.close();
    }
}
