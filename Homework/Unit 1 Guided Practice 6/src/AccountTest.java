public class AccountTest {
    public static void main(String[] args)
    {
        // create two Account objects
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        //display initial value of name for each Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());

    }
} // end class AccountTest
