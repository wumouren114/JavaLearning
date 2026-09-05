import java.util.Scanner;

public class Talk {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的名字");
        String name = sc.nextLine();
        System.out.println("你好，"+name+"!很高兴认知你！");
        sc.close();

    }
}