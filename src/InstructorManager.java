
public class InstructorManager extends UserManager {
	
	public void FindClass(Instructor instructor) {
		 System.out.println("Öðretmenin sýnýfý: "+instructor.InstructorClass);
	}
	
	public void FindLesson(Instructor instructor) {
		System.out.println("Öðretmenin dersþ: "+instructor.InstructorLesson);
		
	}
	public void InstProfile(Instructor instructor) {
		System.out.println("Eðitmenin Adý ve Soyadý: "+instructor.InstructorFirstName+" "+instructor.InstructorLastName);
	}
	
	
	

}
