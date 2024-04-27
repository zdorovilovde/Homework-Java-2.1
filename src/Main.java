public class Main {

    public static void main(String[] args) {

        int initialScore = 100;
        int replenishmentAmount = 1100;
        int bonus = replenishmentAmount / 100;

        if (replenishmentAmount > 1000) {
            System.out.println("Бонус равен:" + bonus);
            System.out.println("Итоговая сумма: " + (initialScore + replenishmentAmount + bonus));
        } else {
            System.out.println("Бонус не начисляется");
            System.out.println("Итоговая сумма: " + (initialScore + replenishmentAmount));
        }
    }


    // Объявляете переменные для входных данных и
    // параметров программы: начального счёта,
    // суммы пополнения и тп

    // Условным оператором проверяете, превысила ли
    // сумма пополнения порог, и для этих двух разных
    // сценариев рассчитываете сумму бонуса и выводите
    // на экран.

}