package kodlamaIoWebsite.dataAccess;

import kodlamaIoWebsite.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs JDBC ile veritabanina eklendi: "+course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Kurs JDBC ile veritabanindan silindi: "+course.getCourseName());
		
	}

}
