public class Task12 {
    public static void main(String[] args) {
        int n =31;
        double q=Math.ceil(n);
        double w=Math.ceil(n*.6);
        double e=Math.ceil(n*.01);
          double a=q*2;
          double s=Math.ceil(q*0.2/0.9);
        System.out.println("100% учеников с весом меньше 30 кг Пирожков "+a+" пакетов молока "+s);

        a=2*w+n-w;   //можно сократить w, писал для понятия логики
        s=Math.ceil(w*0.2/0.9);
        System.out.println("60% учеников с весом меньше 30 кг Пирожков "+a+" пакетов молока "+s);

        a=2*e+n-e;   //можно сократить e, писал для понятия логики
        s=Math.ceil(e*0.2/0.9);
        System.out.println("1% учеников с весом меньше 30 кг Пирожков "+a+" пакетов молока "+s);
    }
}
