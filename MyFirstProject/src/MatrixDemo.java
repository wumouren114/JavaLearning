import java.util.Arrays;

/**
 * 练习：二维数组（第 4 课 · 最后一块）
 *
 * 需求：用二维数组表示"3 个学生 × 3 科成绩"的成绩表，
 *      完成：表格打印、每人总分、全班平均分、（挑战）找最高分的位置。
 */
public class MatrixDemo {
    public static void main(String[] args) {
        // 成绩表：3 行（3 个学生）× 3 列（3 科成绩）
        int[][] scores = {
                {90, 85, 92},
                {78, 88, 80},
                {95, 92, 98}
        };
        int total = 0;

        System.out.println(Arrays.deepToString(scores));// TODO 1：用 Arrays.deepToString 打印整个二维数组，看看它长什么样
        //         提示：System.out.println(Arrays.deepToString(scores));

        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[row].length; col++) {
                System.out.print(scores[row][col] + "\t");// TODO 2：用【双层 for】打印成表格
            }
            System.out.println();
        }
        //         提示：行数 = scores.length；第 row 行的列数 = scores[row].length
        //               内层用 print(scores[row][col] + "\t")，每行结束用空的 println() 换行

        for (int row = 0; row < scores.length; row++) {
            int sum = 0;
            for (int col = 0; col < scores[row].length; col++) {
                sum += scores[row][col];// TODO 3：算每个学生的总分并打印
            }
            System.out.println("第" + (row + 1) + "个学生总分：" + sum);
            total += sum;
        }
        //         提示：在外层循环里定义 int sum = 0;
        //               内层循环里 sum += scores[row][col];
        //               内层循环结束后打印 "第" + (row + 1) + "个学生总分：" + sum
        System.out.println();
        System.out.println("班级平均分：" + (double) total / (scores.length * scores[0].length));// TODO 4：算全班平均分（全班总分 ÷ 总科目数，注意用 (double) 避免整数除法）

        int max = scores[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[row].length; col++) {
                if (scores[row][col] > max) {
                    max = scores[row][col];
                    maxRow = row;
                    maxCol = col;// TODO 5（挑战）：找出最高分，并打印它在第几行第几列
                }
            }
        }

        System.out.println("最高分：" + max + "，在第 " + (maxRow + 1) + " 行第 " + (maxCol + 1) + " 列");//         提示：参考"打擂台"——先假设 scores[0][0] 最高，双层循环里比较并记录 maxRow/maxCol
    }

}
