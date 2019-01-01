package net.tom.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.tom.shoppingbackend.dao.CategoryDAO;
import net.tom.shoppingbackend.dto.Category;

@Repository("caterogyDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();
		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is come Description for Television");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// second catogory
		category = new Category();
		category.setId(2);
		category.setName("mobile");
		category.setDescription("this is come Description for mobile");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// third catagory
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("this is come Description for laptop");
		category.setImageURL("CAT_3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
	
		//enhanced for loop
		for(Category category:categories) {
			if(category.getId()==id)return category;
		}
			
		return null;
	}

}
