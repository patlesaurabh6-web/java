// ATM MACHINE MINI PROJECT

import java.util.*;
public class ATM
{
    public static void main(String[] args) 
    {
        int balance=20000,withdraw,deposite,num;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to ATM machine ");
            System.out.println("1.withdraw");
            System.out.println("2.Deposite");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println();
            num = sc.nextInt();
            switch(num)
            {
                case 1:
                {
                    System.out.print("\nEnter the Amounnt to be deposite : ");
                    withdraw=sc.nextInt();
                    if(balance>=withdraw)
                    {
                        balance=balance-withdraw;
                        System.out.println("Balance Amount is : "+balance);
                        System.out.println("Please Collect your Money ");
                    }
                    else
                    {
                        System.out.println("You Don't Have Enough Money for deposite ");
                    }
                    System.out.println();
                    break;
                }
                case 2:
                {
                    System.out.print("\nEnter the Amounnt to be Deposite : ");
                    deposite=sc.nextInt();
                        balance=balance+deposite;
                        System.out.println("Balance Amount is : "+balance);
                        System.out.println("Money Deposite Succesfully  ");
                  
                    System.out.println();
                    break;
                }
                case 3:
                {
                    System.out.print("\nBalnce of Your Account : "+balance);
                          
                    System.out.println();
                    break;
                }
                case 4:
                {
                    System.exit(0);
                          
                    System.out.println();
                    
                }
            }
         sc.close();   
        }   
    }
}