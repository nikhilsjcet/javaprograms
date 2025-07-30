package basic;
import java.util.Scanner;

class  Student
{
String name;
int age;
void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}
}
public class Studentclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  Student student = new Student();
	     System.out.print("Enter Name: ");
	        student.name = sc.nextLine();

	        System.out.print("Enter Age: ");
	        student.age = sc.nextInt();
	        sc.nextLine();
	        student.displayDetails();
sc.close();
	}

}
