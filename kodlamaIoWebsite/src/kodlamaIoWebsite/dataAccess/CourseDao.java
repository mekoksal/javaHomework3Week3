package kodlamaIoWebsite.dataAccess;

import kodlamaIoWebsite.entities.Course;

public interface CourseDao {

	void add(Course course);
	void delete(Course course);
}
