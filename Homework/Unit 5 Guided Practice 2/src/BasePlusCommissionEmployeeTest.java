//Program Name: Unit 5 Guided Practice 2
//Date Written: 08-24-2019
//Author: Trevor Hanson
//Maintenance History: 08-24-2019
// Created original program: 08-24-2019

public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args)
    {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // get base-salaried commission employee data
        System.out.println("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "first name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee.toString());
    } // end main
} // end class BasePlusCommissionEmployeeTest

    class CommissionEmployee extends Object {
        protected final String firstName;
        protected final String lastName;
        protected final String socialSecurityNumber;
        protected double grossSales;
        protected double commissionRate;

        public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
        }

        // return social security number
public String getSocialSecurityNumber()
{
    return socialSecurityNumber;
}

// set gross sales amount
public void setGrossSales(double grossSales)
{
    if (grossSales < 0.0)
        throw new IllegalArgumentException("Gross sales must be >= 0.0");

    this.grossSales = grossSales;
}

// return gross sales amount
public double getGrossSales()
{
    return grossSales;
}

// set commission rate
public void setCommissionRate(double commissionRate)
{
    if (commissionRate <= 0.0 || commissionRate >= 1.0)
        throw new IllegalArgumentException("Commission rate must be > 0.0 and < 2.0");

    this.commissionRate = commissionRate;
}

// return commission rate
public double getCommissionRate()
{
    return commissionRate;
}

// calculate earnings
public double earnings()
{
    return commissionRate * grossSales;
}

// return String representation of CommissionEmployee object
@Override // indicate that this method overrides a superclass method
public String toString()
{
    return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", firstName, lastName, "socialsecurity number", socialSecurityNumber, "gross sales", grossSales, "commission rate", commissionRate);
}
}