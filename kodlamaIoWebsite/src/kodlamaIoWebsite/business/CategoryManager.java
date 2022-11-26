package kodlamaIoWebsite.business;

import java.util.List;

import kodlamaIoWebsite.core.logging.Logger;
import kodlamaIoWebsite.dataAccess.CategoryDao;
import kodlamaIoWebsite.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	public void add(Category category) throws Exception {
		
		for (Category category1 : categories) {
			if(category1.getCategoryName()==category.getCategoryName()) {
				throw new Exception("Bu isimde kategori var. Baska kategori adi giriniz.");
			}
		}
		
		categoryDao.add(category);
			for (Logger logger : loggers) {
				logger.log();
				}
	}
	
	
	public void delete(Category category) {
		for (Logger logger : loggers) {
			categoryDao.delete(category);
			logger.log();
		}
	}
	
	
}
