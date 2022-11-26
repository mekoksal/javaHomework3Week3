package kodlamaIoWebsite;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoWebsite.business.CategoryManager;
import kodlamaIoWebsite.business.CourseManager;
import kodlamaIoWebsite.business.InstructorManager;
import kodlamaIoWebsite.core.logging.DataBaseLogger;
import kodlamaIoWebsite.core.logging.FileLogger;
import kodlamaIoWebsite.core.logging.Logger;
import kodlamaIoWebsite.core.logging.MailLogger;
import kodlamaIoWebsite.dataAccess.HibernateInstructorDao;
import kodlamaIoWebsite.dataAccess.JdbcCategoryDao;
import kodlamaIoWebsite.dataAccess.JdbcCourseDao;
import kodlamaIoWebsite.entities.Category;
import kodlamaIoWebsite.entities.Course;
import kodlamaIoWebsite.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new FileLogger(), new DataBaseLogger(), new MailLogger()};
		
		Instructor instructor1 = new Instructor(1,"Engin","DEMIROG");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		
		System.out.println("EGITMEN\n");
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		System.out.println("--------------------------------------------------------------");
		
		Category category = new Category(1,"YAZILIM");
		
		List<Category> categories = new ArrayList<>();
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
		
		System.out.println("KATEGORI\n");
		categoryManager.add(category);
		System.out.println("--------------------------------------------------------------");
		
		Course course = new Course(1,"JAVA","Engin DEMIROG",10);
		
		List<Course> courses = new ArrayList<>();
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers,courses);
		
		System.out.println("KURS\n");
		courseManager.add(course);
		courseManager.delete(course);
		
		
		
	}

}
