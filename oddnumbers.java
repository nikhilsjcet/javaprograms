package basic;
import java.util.Scanner;

public class oddnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i;
		for (i=1;i<=50;i++)
		{
			if (i%2==0)
				continue;
			System.out.println(i);
			sc.close();
		}

	}

}
