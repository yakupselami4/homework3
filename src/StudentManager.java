
public class StudentManager extends UserManager {
	public void FindLesson(Student student) {
		System.out.println("Öðrencinin dersi: "+student.StudentLessonClass);
	}
	
	public void FindInstructor(Student student) {
		System.out.println("Öðrencinin öðretmeni: "+student.StudentInstructor);
		
	}
	public void StdProfile(Student student) {
		System.out.println("Öðrencinin adý ve soyadý:"+student.getStudentFirstName()+" "+student.getStudentLastName());
	}
	

}
