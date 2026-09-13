public class FloatTest {
    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        double b = 0.3;
        System.out.println(Math.abs(a - b) < 0.000001);
    }
}