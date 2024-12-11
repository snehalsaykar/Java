public class Demo {
    public static void main(String[] args) {
        int initiallventory = 500;
        int dailySales = 50;
        int days = 7;

        System.out.println("inventor tracking over 7 days:");

        for (int i = 1; i <= days; i++) {
            initiallnventory -= dailySales;
            System.out.println("Day" + i + ":" + initiallventory + "units");
        }
    }
}