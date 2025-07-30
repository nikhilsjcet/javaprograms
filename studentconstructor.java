package nikhiljava;
class Student{
	int rollNumber;
	String name;
	int m1,m2,m3;
	float avg;
	Student (String name, int rollNumber,int m1,int m2, int m3){
		this.name=name;
		this.rollNumber=rollNumber;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}

public float calculateAverage(){
	return (m1+m2+m3)/3;
	
}
public void displayDetails(){
	System.out.println("Name:" +name);
	System.out.println("Roll Number:" +rollNumber);
	System.out.println("First Mark: "+m1);
	System.out.println("Second Mark: "+m2);
	System.out.println("Third Mark: "+m3);
	System.out.println("Average Mark: "+calculateAverage());


}
}

public class studentconstructor {

	public static void main(String[] args) {
		Student student1=new Student("Nikhil",32,34,56,76);
		Student student2=new Student("Alan",36,38,52,78);
		student1.displayDetails();
		student2.displayDetails();

	}


}
