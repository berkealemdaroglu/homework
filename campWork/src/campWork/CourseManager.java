package campWork;

public class CourseManager {
		//course creating add 
	
	public void add(Course course, Logger logger, TeacherUser teacherUser) {
		System.out.println( course.courseTitle + " Öğretmen Tarafından Kurs Oluşturuldu " + teacherUser.firstName + teacherUser.lastName);
		logger.log();
	}
	
	public void singIn(Course course) {
		Boolean singIn = true;
		if(singIn == true) {
			course.courseSituation = "Tamamlanma Durumu";
		}else {
			course.courseSituation = "Kurs Ücretsiz yada Ücreti";
		}
	}
}
