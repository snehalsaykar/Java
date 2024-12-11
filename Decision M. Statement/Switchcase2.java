//WAJP to print all the months in a year based on number of days they have
class Switchcase2 {
    public static void main(String[] args) {
        int days = 32;
        switch (days) {
            case 28:
                System.out.println("FEB");
            case 30:
                System.out.println("APR");
                System.out.println("JUN");
                System.out.println("SEP");
                System.out.println("NOV");

            case 31:
                System.out.println("JAN");
                System.out.println("MARCH");
                System.out.println("MAY");
                System.out.println("JUL");
                System.out.println("AUG");
                System.out.println("OCT");
                System.out.println("DEC");
                break;

            default:
                System.out.println("INVALID NUMBER");
        }
        System.out.println("HELLO");
    }
}
