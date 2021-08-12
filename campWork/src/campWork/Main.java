package campWork;

public class Main {

	public static void main(String[] args) {
		
		
		TeacherUser teacher1 = new TeacherUser();
		teacher1.id = 1;
		teacher1.teacherId = 1;
		teacher1.firstName = "Engin";
		teacher1.lastName = "Demiroğ";
		teacher1.commentAdd = true;
		teacher1.courseCreating = true;
		teacher1.email = "email@gmail.com";
		
		StudentUser student1 = new StudentUser();
		student1.id = 2;
		student1.studentId = 2;
		student1.commentAdd = true;
		student1.firstName = "Ersin";
		student1.lastName = "Alemdaroğlu";
		student1.email = "ersin@gmail.com";
		
		CourseManager courseManager = new CourseManager();
		
		Course java = new Course();
		java.courseImage = "javaImage";
		java.courseInstructor = "Engin Demiroğ";
		java.courseTitle = "Java Geliştirme Kampı";
		courseManager.singIn(java);
		
		
		Course cSharp = new Course();
		cSharp.courseImage = "CSharpImage";
		cSharp.courseInstructor = "Engin Demiroğ";
		cSharp.courseTitle = "C# Geliştirme Kampı";
		courseManager.singIn(cSharp);
		
		
		
		courseManager.add(java, new DatabaseLogger(), teacher1);
		System.out.println("Kamp Görseli :" + java.courseImage + " " + "Kamp Eğitmeni :" + java.courseInstructor + " " + "Kamp Durumu :" + java.courseSituation + " " + "Kamp İsmi :" + java.courseTitle + teacher1.teacherId);

		courseManager.add(cSharp, new DatabaseLogger(), teacher1);
		System.out.println("Kamp Görseli :" + cSharp.courseImage + " " + "Kamp Eğitmeni :" + cSharp.courseInstructor + " " + "Kamp Durumu :" + cSharp.courseSituation + " " + "Kamp İsmi :" + cSharp.courseTitle + teacher1.teacherId);
		
		
		TeacherManager teacherManager = new TeacherManager();
		teacherManager.courseAdd(cSharp, new DatabaseLogger(), teacher1);
		teacherManager.courseAdd(cSharp, new DatabaseLogger(), teacher1);
		//Hello
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.studentAdd(java, student1, new DatabaseLogger());
		
		CorporateUser corporateUser1 = new CorporateUser();
		corporateUser1.id = 1;
		corporateUser1.comporateId = 1;
		corporateUser1.email = "corporate@gmail.com";
		corporateUser1.taxNumber = "151515";
		corporateUser1.commentAdd = true;
		
		Course comporateJava = new Course();
		comporateJava.courseImage = "Comporate Image";
		comporateJava.courseTitle = "Kurumsal Java Mimarisi";
		comporateJava.courseInstructor = "Sinan Akgül";
		courseManager.singIn(comporateJava);

		
		ComporateManager comporateManager = new ComporateManager();
		comporateManager.comporateAdd(comporateJava, new DatabaseLogger(), corporateUser1);
		
		studentManager.studentAdd(comporateJava, student1, new DatabaseLogger());
		
	}

}
