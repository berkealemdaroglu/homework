package campWork;

public class CourseManager {
		//add 
	
	public void add(Course course, Logger logger) {
		System.out.println(course.courseTitle + " Kursu Başarıyla Eklendi. Başarılar!");
		logger.log();
	}
}
