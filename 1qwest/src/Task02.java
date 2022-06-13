public class Task02 {
    public static void main(String[] args) {
        int n = 546;
        int z = n/100;
        n = n-z*100;
        int x = n/10;
        n = n-x*10;
        int a = z+x+n;
        System.out.println("Сумма цифр числа =  " +a);
    }






}
