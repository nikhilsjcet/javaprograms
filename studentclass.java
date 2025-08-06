package nikhil;

class studentclass {
    String name;
    static int studentCount = 0;

    studentclass(String name) {
        this.name = name;
        studentCount++;
    }

    static int getStudentCount() {
        return studentCount;
    }

    public static void main(String[] args) {
        studentclass student1 = new studentclass("Albin");
        studentclass student2 = new studentclass("Rayan");
        studentclass student3 = new studentclass("Nikhil");

        System.out.println("Total number of students created: " + studentclass.getStudentCount());
        System.out.println("Student 1: " + student1.name);
        System.out.println("Student 2: " + student2.name);
        System.out.println("Student 3: " + student3.name);
    }
}

