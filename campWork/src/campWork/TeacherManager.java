package campWork;

public class TeacherManager extends UserManager {
		//Course Creating Add
	
	
	public void courseAdd(Course course, Logger logger, TeacherUser teacherUser) {
		System.out.println( course.courseTitle + " Öğretmen Tarafından Kurs Oluşturuldu " + teacherUser.firstName + teacherUser.lastName);
		logger.log();
	}

}
