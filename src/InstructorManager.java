
public class InstructorManager extends UserManager {
	
	public void FindClass(Instructor instructor) {
		 System.out.println("��retmenin s�n�f�: "+instructor.InstructorClass);
	}
	
	public void FindLesson(Instructor instructor) {
		System.out.println("��retmenin ders�: "+instructor.InstructorLesson);
		
	}
	public void InstProfile(Instructor instructor) {
		System.out.println("E�itmenin Ad� ve Soyad�: "+instructor.InstructorFirstName+" "+instructor.InstructorLastName);
	}
	
	
	

}
