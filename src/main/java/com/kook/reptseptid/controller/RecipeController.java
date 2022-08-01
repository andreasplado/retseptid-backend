package com.kook.reptseptid.controller;

import java.util.List;
import java.util.Optional;

import com.kook.reptseptid.dao.RecipeDAO;
import com.kook.reptseptid.model.Recipe;
import com.kook.reptseptid.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @RequestMapping(value="/recipes", method=RequestMethod.GET)
    public List<Recipe> readRecipes() {
        return recipeService.getRecipes();
    }

    @RequestMapping(value="/recipes/{empId}", method=RequestMethod.DELETE)
    public Optional<Recipe> readRecipes(@PathVariable(value = "empId") Long id, @RequestBody Recipe recipe) {
        return recipeService.deleteRecipe(id);
    }

}
