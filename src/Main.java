
public class Main {
	public static void main(String[] args) {
	
		
	Student student1= new Student();
	student1.setId(1);
	student1.setStudentFirstName("Yakup Selami");
	student1.setStudentLastName("Öztürk");
	student1.setStudentLessonClass("Ýngilizce");
	student1.setStudentNumber("14060");
	student1.setStudentInstructor("Ali Yýlmaz");
	
	Student student2= new Student();
	student2.setId(2);
	student2.setStudentFirstName("Ahmet Kaan");
	student2.setStudentLastName("Gedikli");
	student2.setStudentLessonClass("Fransýzca");
	student2.setStudentNumber("14030");
	student2.setStudentInstructor("Züleyha Selim");
	
	
	Instructor instructor1=new Instructor();
	instructor1.setId(3);
	instructor1.setInstructorFirstName("Ali");
	instructor1.setInstructorLastName("Yýlmaz");
	instructor1.setInstructorLesson("Ýngilizce");
	instructor1.setInstructorClass("11-B");
	
	Instructor instructor2=new Instructor();
	instructor2.setId(4);
	instructor2.setInstructorFirstName("Züleyha");
	instructor2.setInstructorLastName("Selim");
	instructor2.setInstructorLesson("Fransýzca");
	instructor2.setInstructorClass("11-A");
	
	UserManager usermanager2= new UserManager();
	usermanager2.AddUser(student1);
	System.out.println("--------------------");
	UserManager usermanager3= new UserManager();
	usermanager3.AddUser(student2);
	System.out.println("--------------------");
	UserManager usermanager= new UserManager();
	usermanager.AddUser(instructor1);
	System.out.println("--------------------");
	UserManager usermanager1= new UserManager();
	usermanager1.AddUser(instructor2);
	System.out.println("--------------------");

	StudentManager studentmanager= new StudentManager();
	studentmanager.FindInstructor(student1);
	studentmanager.FindLesson(student1);
	studentmanager.StdProfile(student1);
	
	System.out.println("--------------------");
	
	StudentManager studentmanager1= new StudentManager();
	studentmanager1.FindInstructor(student2);
	studentmanager1.FindLesson(student2);
	studentmanager1.StdProfile(student2);
	
	System.out.println("--------------------");
	
	InstructorManager instructormanager= new InstructorManager();
	instructormanager.FindClass(instructor1);
	instructormanager.FindLesson(instructor1);
	instructormanager.InstProfile(instructor1);
	
	System.out.println("--------------------");
	
	InstructorManager instructormanager1= new InstructorManager();
	instructormanager1.FindClass(instructor2);
	instructormanager1.FindLesson(instructor2);
	instructormanager1.InstProfile(instructor2);
	
	
	
	
	
	
	}
}
