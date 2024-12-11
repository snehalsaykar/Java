class Switchcase1 {
    public static void main(String[] args) {
        switch ("ABC") {
            case "FEB":
                System.out.println(28);
                break;

            case "APR":
            case "JUN":
            case "SEP":
            case "NOV":
                System.out.println(30);

            case "JAN":
            case "MAR":
            case "MAY":
            case "JUL":
            case "AUG":
            case "OCT":
            case "DEC":
                System.out.println(31);
                break;
            default:
                System.out.println("INVALID MONTH");
        }
    }

}
