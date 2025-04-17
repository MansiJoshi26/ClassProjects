import java.util.*;

class StudentSort implements Comparable<StudentSort> {
    private int rollno;
    private String name;
    private double marks;

   
    public StudentSort(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

        public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

        public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
     public int compareTo(StudentSort ss) {
        return Double.compare(this.marks, ss.marks);
    }

    public String toString() {
        return "RollNo: " + rollno + ", Name: " + name + ", Marks: " + marks;
    }

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        TreeSet<StudentSort> std = new TreeSet<>();
	 System.out.print("Enter Number of students: ");

        int n=sc.nextInt();


	for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll Number: ");
            int rollno = sc.nextInt();
            sc.nextLine(); // Consume newline character
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            StudentSort student = new StudentSort(rollno, name, marks);
            std.add(student);
        }

                System.out.println("\nStudents in ascending order of marks:");
        for (StudentSort student : std) {
            System.out.println(student);
        }

        sc.close();
    }
}
