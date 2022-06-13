public class Task07 {
    public static void main(String[] args) {
        double z=17.5;
        double x=400000;
        double c=x+x/100*z;
        c=c+c/100*z;
        System.out.println("Вклад через 2 года с процентом "+z+" составит "+c);
        System.out.println("Процент зачисляется раз в год");
    }
}
