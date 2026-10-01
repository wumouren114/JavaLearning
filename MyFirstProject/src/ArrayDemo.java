import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "次成绩：");
            scores[i] = Integer.parseInt(sc.nextLine());
            sum += scores[i];
        }
        System.out.println("这5次成绩为：");
        for (int s : scores) {
            System.out.print(s + "  ");
        }
        System.out.println();
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + (double) sum / scores.length);
        sc.close();
    }
}