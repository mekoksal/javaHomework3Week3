package kodlamaIoWebsite.dataAccess;

import kodlamaIoWebsite.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Egitmen JDBC ile veritabanina eklendi: "+instructor.getFirstName()+""+instructor.getLastName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Egitmen JDBC ile veritabanindan silindi: "+instructor.getFirstName()+""+instructor.getLastName());
		
	}

}
