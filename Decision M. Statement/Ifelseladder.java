class Ifelseladder {
    public static void main(String[] args) {
        int percentage = 66;
        if (percentage >= 35 && percentage <= 45) {
            System.out.println("PASS");
        } else if (percentage > 45 && percentage < 60) {
            System.out.println("SECOND CLASS");
        } else if (percentage > 60 && percentage < 80) {
            System.out.println("FIRST CLASS");
        } else if (percentage > 80 && percentage < 100) {
            System.out.println("DISTINCTION");
        } else if (percentage >= 0 && percentage < 35) {
            System.out.println("FAIL");
        } else {

            System.out.println("please enter valid percentage");
        }
    }

}
