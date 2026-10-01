import java.util.Arrays;

/**
 * 练习：数组排序与最值（第 4 课 · 第三小块）
 *
 * 需求：用 Arrays 工具类完成打印、排序、取最值，并体验"引用陷阱"和"增强 for 改不了值"。
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] scores = {88, 92, 70, 95, 81};

        System.out.println(Arrays.toString(scores));// TODO 1：用 Arrays.toString 打印原数组
        //         提示：System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));// TODO 2：用 Arrays.sort 排序，然后再打印一次（观察从小到大）

        System.out.println("最低分；" + scores[0]);
        System.out.println("最高分；" + scores[scores.length - 1]);// TODO 3：打印最低分（scores[0]）和最高分（scores[scores.length - 1]）

        System.out.print("倒序；");
        for(int i = scores.length - 1; i >= 0; i--) {
            System.out.print(scores[i] + "  ");// TODO 4（挑战）：倒序输出 —— 从最后一个往前遍历
        }
        System.out.println();
        //         提示：for (int i = scores.length - 1; i >= 0; i--)

        int[] copy2 = Arrays.copyOf(scores, scores.length);
        copy2[0] = 0;
        System.out.println(Arrays.toString(scores));// TODO 5（体验坑）：
        //   a) 写 int[] copy = scores; 然后 copy[0] = 0;
        //      再打印 scores —— 看看原数组是不是被改了（引用陷阱）
        //   b) 换成 int[] copy2 = Arrays.copyOf(scores, scores.length);
        //      再 copy2[0] = 0; 打印 scores —— 这次原数组不变 ✅

        // TODO 6（体验坑）：
        for (int i = 0;i < scores.length; i++) {
            scores[i] = scores[i] + 5;
        }
        System.out.println(Arrays.toString(scores));
        //   for (int s : scores) { s = s + 5; }
        //   打印 scores —— 发现没变化（增强 for 改的是副本）
        //   然后改用普通 for：scores[i] = scores[i] + 5;
        //   再打印 —— 这次真的每个都 +5 了
    }
}
