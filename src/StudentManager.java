
public class StudentManager extends UserManager {
	public void FindLesson(Student student) {
		System.out.println("��rencinin dersi: "+student.StudentLessonClass);
	}
	
	public void FindInstructor(Student student) {
		System.out.println("��rencinin ��retmeni: "+student.StudentInstructor);
		
	}
	public void StdProfile(Student student) {
		System.out.println("��rencinin ad� ve soyad�:"+student.getStudentFirstName()+" "+student.getStudentLastName());
	}
	

}
