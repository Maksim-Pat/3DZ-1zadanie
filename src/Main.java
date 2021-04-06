public class Main {
    public static void main(String[] args) {
        boolean registered = true;
        int TicketPrice = 20;
        int Bonus = 1;
        int TotalBonus = TicketPrice / Bonus;
        int FloatBonus = (int) TotalBonus;

        System.out.println(FloatBonus);
    }
}