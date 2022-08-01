package com.kook.reptseptid.service;

import com.kook.reptseptid.model.Recipe;
import com.kook.reptseptid.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    public Recipe createRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }

    public List<Recipe> getRecipes(){
        return recipeRepository.findAll();
    }

    public Optional<Recipe> deleteRecipe(Long id){
        if(recipeRepository.existsById(id)){
            recipeRepository.deleteById(id);
            return recipeRepository.findById(id);
        }

        return null;
    }

}
