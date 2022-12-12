public class Main {
    public static void main(String[] args) {
        int account = 100;
        int replenishment = 1050;
        int bonus;
        if (replenishment >= 1001) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Ваш счет составляет: " + (replenishment + account + bonus) + " руб.");
        System.out.println("Вам зачислен бонус: " + bonus + " руб.");
    }
}