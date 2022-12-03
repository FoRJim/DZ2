public class Main {
    public static void main(String[] args) {
        int account = 100 ;
            if (account >=1) {
                System.out.println("На вашем счету: " + account + " руб.");
            } else {
                System.out.println("На вашем счету: " + account + " руб.");
            }
        int replenishment = 5000;
            System.out.println("Вы пополнили счет на: " + replenishment + " руб.");
        int bonus;
            if (replenishment >= 1000) {
                bonus = replenishment / 100;
            } else {
                bonus = 0;
            }
                System.out.println("Вам зачислен бонус: " + bonus + " руб.");
                System.out.println("Ваш счет составлявет: " + (account + replenishment + bonus) + " руб." );
    }
}