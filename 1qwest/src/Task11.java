public class Task11 {
    public static void main(String[] args) {
        double q = 100000;
        double w = Math.floor(q/86400);
        q=q-w*86400;
        double e = Math.floor(q/3600);
        q=q-e*3600;
        double r = Math.floor(q/60);
        q=q-r*60;
        System.out.println(w+" Дней "+e+" Часов "+r+" Минут "+q+" Секунд");
    }
}
