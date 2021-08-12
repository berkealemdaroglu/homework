package campWork;

public class StudentManager extends UserManager {
		
	public void studentAdd(Course course, StudentUser studentUser, Logger logger) {
		System.out.println(studentUser.firstName + studentUser.email + course.courseTitle + "Kurs Kitaplığa Eklendi");
	}
}
