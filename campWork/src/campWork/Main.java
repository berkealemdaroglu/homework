package campWork;

public class Main {

	public static void main(String[] args) {
		

		Course java = new Course();
		java.courseImage = "javaImage";
		java.courseInstructor = "Engin Demiroğ";
		java.courseTitle = "Java Geliştirme Kampı";
		Boolean singIn = false;
		if(singIn == true) {
			java.courseSituation = "Tamamlanma Durumu";
		}else {
			java.courseSituation = "Kurs Ücretsiz yada Ücreti";
		}
		
		System.out.println("Kamp Görseli :" + java.courseImage + " " + "Kamp Eğitmeni :" + java.courseInstructor + " " + "Kamp Durumu :" + java.courseSituation + " " + "Kamp İsmi :" + java.courseTitle);
		
		
		Course cSharp = new Course();
		cSharp.courseImage = "CSharpImage";
		cSharp.courseInstructor = "Engin Demiroğ";
		cSharp.courseTitle = "C# Geliştirme Kampı";
		if(singIn == true) {
			cSharp.courseSituation = "Tamamlanma Durumu";
		}else {
			cSharp.courseSituation = "Kurs Ücretsiz yada Ücreti";
		}
		
		System.out.println("Kamp Görseli :" + cSharp.courseImage + " " + "Kamp Eğitmeni :" + cSharp.courseInstructor + " " + "Kamp Durumu :" + cSharp.courseSituation + " " + "Kamp İsmi :" + cSharp.courseTitle);

		
		CourseManager courseManager = new CourseManager();
		courseManager.add(java, new DatabaseLogger());
		courseManager.add(cSharp, new DatabaseLogger());
		
		//Hello
		
		
		
	}

}
