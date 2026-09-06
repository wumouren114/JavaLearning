public class demo2 {
    public static void main(String[] args) {
        String name = "吴政闻";
        int age = 18;
        double height = 175.5;
        boolean isStudent = true;

        System.out.println("我是" + name);
        System.out.println("今年" + age + "岁");
        System.out.println("身高" + height + "cm");
        System.out.print("是学生吗" + isStudent);

        int m = (int)175.5;
        System.out.println("截断实验" + m);

        double d = 100;
        System.out.println("自动升级" + d);
    }
}
