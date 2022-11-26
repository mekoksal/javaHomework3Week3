package kodlamaIoWebsite.dataAccess;

import kodlamaIoWebsite.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {

		System.out.println("Kategori Hibernate ile veritabanina eklendi: "+category.getCategoryName());
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori Hibernate ile veritabanindan silindi: "+category.getCategoryName());
		
	}

}
