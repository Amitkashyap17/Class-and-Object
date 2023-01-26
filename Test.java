package OPPS;

public class Test {
    public static void main(String[] args) {

        //now creating object of employee
        Employee st1 = new Employee();

        st1.EmpId=12;
        st1.EmpName="Amit";
        st1.Age=25;
        st1.Salary=25000;

        st1.Employer();
        st1.EmpFullDetails();


        Employee st2= new Employee();

        st2.Salary=35000;
        st2.Age=26;
        st2.EmpId=15;
        st2.EmpName="Ashok";

        st2.Employer();
        st2.EmpFullDetails();

    }
}
