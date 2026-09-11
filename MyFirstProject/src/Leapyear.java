import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = sc.nextInt();
        boolean div400 = (year % 400 == 0);
        boolean div4 = (year % 4 ==0);
        boolean not100 = (year % 100 !=0);

        boolean leap = div400 || (div4 && not100);
        if (leap) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "是平年");
        }
        sc.close();


    }
}
