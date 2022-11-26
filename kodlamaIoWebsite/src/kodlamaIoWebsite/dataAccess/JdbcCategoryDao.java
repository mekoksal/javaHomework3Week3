package kodlamaIoWebsite.dataAccess;

import kodlamaIoWebsite.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori JDBC ile veritabanina eklendi:"+category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori JDBC ile veritabanindan silindi:"+category.getCategoryName());
		
	}

}
