package net.tom.shoppingbackend.dao;

import java.util.List;

import net.tom.shoppingbackend.dto.Category;

public interface CategoryDAO {
/**/
	List<Category> list();
	Category get(int id);
}

