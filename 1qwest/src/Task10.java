public class Task10 {
    public static void main(String[] args) {
        double q=91.5;
        double w=182;
        double e=w-110;
        if (e<=q){
            double r=q-e;
            System.out.println("Нужно сбросить "+r+" килограмм");
        }
        else {
            double t=e-q;
            System.out.println("Нужно набрать "+t+" килограмм");
        }
    }
}
