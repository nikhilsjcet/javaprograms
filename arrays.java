package basics;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
				int [] array = new int[5];
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the Elements:");
				for(int i=0;i<5;i++)
				{
					array[i]=sc.nextInt();
				}
				System.out.println("Array Contents:");
				for (int i=0;i<5;i++) {
				System.out.println(array[i]+"\t");
		
		
		
				}

				}
	}


