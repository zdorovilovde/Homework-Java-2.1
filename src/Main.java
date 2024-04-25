public class Main {
    public static void main(String[] args) {

        int initialScore = 100;
        int replenishmentAmount = 1100;
        int bonus = replenishmentAmount / 100;
        System.out.println("Итоговая сумма: " + (initialScore + replenishmentAmount));
        if (replenishmentAmount > 1000) {
            System.out.println("Бонус равен:" + bonus);
        } else {
            System.out.println("Бонус не начисляется");
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
