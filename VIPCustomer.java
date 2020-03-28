public class VIPCustomer
{
    private String name;
    private int creditLimit;
    private String email;

    public VIPCustomer()
    {
        this("default Name", 0000, "Default email");
    }
    public VIPCustomer(String name, int creditLimit)
    {
        this(name, creditLimit, "Default email");

    }
    public VIPCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
