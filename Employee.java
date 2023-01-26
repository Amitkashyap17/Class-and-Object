package OPPS;

public class Employee {

    //Data
    int EmpId;
    String EmpName;
    int Age;
    int Salary;

    //Creating Non-Parameterized constructor

    public Employee(){
        System.out.println("Creating Object");
    }

    //methods

    public void Employer(){
        System.out.println(EmpName + " is working in Cognizant.");
    }

    public void EmpFullDetails(){
        System.out.println("My name is " +EmpName);
        System.out.println("My id is " +EmpId);
        System.out.println("My age is " +Age);
        System.out.println("My salary is Rs" +Salary);
    }

}
