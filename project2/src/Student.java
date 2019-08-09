
public class Student {
	private int studentId;
	private String studentName;
	private int fees;
	private int marks;
	public Student(){
	
		studentId = 0;
		studentName = "NA";
		fees = 1000;
		marks = 50;
	}
	public Student(int studentId, String studentName, int fees, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.fees = fees;
		this.marks = marks;
	}
	public Student(int studentId, String studentName, int marks) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	public Student(int studentId, int fees ,String studentName) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.fees = fees;
	}
	public Student(int studentId, String studentName) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
   public static void main(String[] args) {
	   Student student = new Student(8,"Harshini");
	   System.out.println(student.studentId);
	   System.out.println(student.studentName);
	   System.out.println(student.fees);
		
	
}
}
