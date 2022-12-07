public class Main {
    public static void main(String[] args) {
        int account = 100;
        int replenishment = 1100;
        int bonus;
        if (replenishment > 1099) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("На вашем счету: " + account + " руб.");
        System.out.println("Вы пополнили счет на: " + replenishment + " руб.");
        System.out.println("Вам зачислен бонус: " + bonus + " руб.");
        System.out.println("Ваш счет составлявет: " + (account + replenishment + bonus) + " руб.");
    }
}