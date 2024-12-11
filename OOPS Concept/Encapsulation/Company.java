public class Company {
    private String Name;
    private String Location;
    private String Email;
    private long Contact;

    public String getName()
    {
        return this.Name;
    }
    public String getLocation()
    {
        return this.Location;
    }
    public String getEmail()
    {
        return this.Email;
    }
    public long getContact()
    {
        return this.Contact;
    }

    public void setName (String Name)
    {
        this.Name=Name;
    }
    public void setLocation (String Location)
    {
        this.Location=Location;
    }
    public void setEmail(String Email)
    {
        this.Email=Email;
    }
    public void setContact(long Contact)
    {
        this.Contact=Contact;
    }
}
