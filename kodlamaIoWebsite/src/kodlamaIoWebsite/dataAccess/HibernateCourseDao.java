package kodlamaIoWebsite.dataAccess;

import kodlamaIoWebsite.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs Hibernate ile veritabanina eklendi: "+course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Kurs Hibernate ile veritabanindan silindi: "+course.getCourseName());
		
	}

}
