package campWork;

public class ComporateManager extends UserManager {
		
	public void comporateAdd(Course course, Logger logger, CorporateUser corporateUser) {
		System.out.println(course.courseTitle + corporateUser.taxNumber + "Kurs Oluşturuldu");
		logger.log();
	}
}
