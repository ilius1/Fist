public class Task09 {
    public static void main(String[] args) {
        double q=9.2;
        long w=Math.round(q);
        if (q == w) {
            System.out.println("Число не имеет вещественной части");
        }
        else {
            System.out.println("Число имеет вещественную часть");
        }
    }
}
