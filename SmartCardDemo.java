// mini project 
// smart  card

import java.util.Scanner;
class card
{
    int emp_idn;
    public void MarkAttendance(Employee e)
    {
        emp_idn=e.getEmpId();
        //instruction to mark present for empid....
        System.out.println("Employee "+emp_idn+" is marked Present");
        
    }
    public int getEmpIdn(Employee e)
    {
        return e.empid;
    }
}
class Employee
{
    int empid;
    Employee()
    {
        System.out.println("ENter the Employee Id ");
        Scanner sc=new Scanner(System.in);
        this.empid=sc.nextInt();
        sc.close();
    }
    int getEmpId()
    {
        return empid;
    }
    public void Login(card sc)
    {
        //instruction to Login Functionallity
        //get empid of the smart card holder
        int eid=sc.getEmpIdn(this);
        //login and mark attendence
        System.out.println("Login Successfull for Employee "+eid);
    }
}
public class SmartCardDemo
{
    public static void main(String[] args) 
    {
        System.out.println("**** ASSOCIATION BETWEEN EMPLOYEE AND SMART CARD ****");
        Employee e=new Employee();
        System.out.println("NEW EMPLOYEE IS CREATED ");
        card scd=new card();
        scd.MarkAttendance(e); //passing the refernce of emp to smart  card
        e.Login(scd);//passing the refernce of smartcard to Emp   
    }
}