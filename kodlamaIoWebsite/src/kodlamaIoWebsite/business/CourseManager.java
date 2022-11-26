package kodlamaIoWebsite.business;

import java.util.List;

import kodlamaIoWebsite.core.logging.Logger;
import kodlamaIoWebsite.dataAccess.CourseDao;
import kodlamaIoWebsite.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	
	public void add(Course course) throws Exception {
		for (Course coursen : courses) {
			if(coursen.getCourseName()==course.getCourseName()) {
				throw new Exception("Bu isimde kurs var. Baska kurs adi giriniz.");
			}
		}
		
		
			Course coursecp = new Course();
			if(coursecp.getCoursePrice()<0) {
				throw new Exception("Kursun fiyati 0'dan dusuk olamaz");
			}
		
		
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log();
		}
	}
	
	
	public void delete(Course course) {
		courseDao.delete(course);
		for (Logger logger : loggers) {
			
			logger.log();
		}
	}
	
}
