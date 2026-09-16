public class LoopDemo {
    public static void main(String[] args) {
        int sum = 0;                        // 累加器：先准备一个空盒子
        for (int i = 1; i <= 100; i++) {
            sum += i;                       // 把 i 加进 sum（sum = sum + i 的简写）
        }
        System.out.println("1 到 100 的和是：" + sum);
    }
}