package org.java.spring.db.service;

import java.util.List;
import org.java.spring.db.pojo.Ingredient;
import org.java.spring.db.pojo.SpecialDiscount;
import org.java.spring.db.repo.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepo ingredientRepo;
	
	public List<Ingredient> findAll() {
		
		return ingredientRepo.findAll();
	}
	
	public Ingredient findById(int id) {
		
		return ingredientRepo.findById(id).get();
	}
	
	public void save(Ingredient ingredient) {
		
		ingredientRepo.save(ingredient);
	}
	
    public void delete(Ingredient ingredient) {
		
		ingredientRepo.delete(ingredient);
	}
	
    public void deleteById(int id) {
		
		ingredientRepo.deleteById(id);
	}
	
 
	

}
