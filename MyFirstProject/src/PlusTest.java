public class PlusTest {
    public static void main(String[] args) {
        int x = 3;
        int y =(x++) + 1;
        System.out.println("x=" + x + ",y=" + y);

        int a = 5;
        int b = a++;
        int c = ++a;
        System.out.println("a=" + a + ",b=" + b + ",c=" + c);
    }
}
