public class Account {
    private String name; // instance variable

    public Account(String name) // constructor name is class name
    {
        this.name = name;
    }

    // method to set the name
    public void setName(String name)
    {
        this.name = name;
    }

    // method to retrieve the name
    public String getName()
    {
        return name;
    }
} // end class Account
