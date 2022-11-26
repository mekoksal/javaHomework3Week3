package kodlamaIoWebsite.business;

import kodlamaIoWebsite.core.logging.Logger;
import kodlamaIoWebsite.dataAccess.InstructorDao;
import kodlamaIoWebsite.entities.Instructor;

public class InstructorManager {
	
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log();
		}
	}

	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
		for (Logger logger : loggers) {
			logger.log();
		}
	}
	
}
