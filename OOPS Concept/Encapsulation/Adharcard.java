public class Adharcard {
    private String Name;
    private String Location;
    private long AdharNo;

    public String getName() {
        return this.Name;
    }

    public String getLocation() {
        return this.Location;
    }

    public long getNo() {
        return this.No;
    }

    public void setname(String Name) {
        this.Name = Name;
    }

    public void setlocation(String Location) {
        this.Location = Location;
    }

    public void setNumber(String No) {
        this.No = No;
    }

    public static void main(String[] args) {
        Adharcard Obj1 = new Adharcard();

        Obj1. setname("Snehal");
        Obj1. setlocation("Nashik");
        Obj1. setAdharNo(675060489787);

        String a = Obj1.getName();  
        String b = Obj1.getLocation();
        long c = Obj1.No();  
        
        System.out.println("Name=" +a);
        System.out.println("Location=" +b);
        System.out.println("AdharNo="+c);
    }
}
