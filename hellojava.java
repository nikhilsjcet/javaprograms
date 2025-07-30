package basic;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class hellojava {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		//NAME ENTERING
		
		
		System.out.println("Hello Java");
		System.out.println("Enter Your Name:");
		String name = sc.nextLine();
		System.out.println("Hi "+name);
		System.out.println("Enter Age:");
		int number = sc.nextInt();
		System.out.println("Your Age is " + number);
		
		//PRINTING N NUMBERS
		
		
		System.out.println("Enter Starting Number:");
		int start = sc.nextInt();
		System.out.println("Enter Ending Number:");
		int end = sc.nextInt();
		for (int i=start;i<=end;i++)
		{
			System.out.print(i + " ");

		}
		
		//ODD OR EVEN 
		
		
		System.out.println("\nEnter A Number to Check Whether Even or Odd");
		int n= sc.nextInt();
		if (n%2==0)
		{
			System.out.println("It is an Even NUmber");
		}
		else
		{
			System.out.println("It is an Odd Number");
		}
		
		
		
		//CALCULATOR
		
		
		
		System.out.println("Enter First Number in Calculator");
		double n1 = sc.nextDouble();
		System.out.println("Enter Second Number in Calculator");
		double n2 = sc.nextDouble();
		System.out.println("Enter the Operation.Please enter +, -, *, or /.\"");
		char operation = sc.next().charAt(0);
		double result;
		switch (operation)
		{
			case '+':
				result=n1+n2;
				System.out.println("Result is"+result);
				break;
			case '-':
				result=n1-n2;
				System.out.println("Result is"+result);
				break;
			case '*':
				result=n1*n2;
				System.out.println("Result is"+result);
				break;
			  case '/':
	                if (n2 == 0) {
	                    System.out.println("Error! Division by zero is not allowed.");
	                    return;
	                }
	                else
	                {
	                result = n1 / n2;
	                System.out.println("Result is"+ result);
	                break;
	                }
	            default:
	                System.out.println("Invalid operator! Please enter +, -, *, or /.");
	                break;
		}
		
		
		//DATE AND TIME
		

		LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
    	LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        
	sc.close();
}
}
