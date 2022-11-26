package kodlamaIoWebsite.dataAccess;

import kodlamaIoWebsite.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Egitmen Hibernate ile veritabanina eklendi: "+instructor.getFirstName()+""+instructor.getLastName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Egitmen Hibernate ile veritabanindan silindi: "+instructor.getFirstName()+""+instructor.getLastName());
		
	}

}
