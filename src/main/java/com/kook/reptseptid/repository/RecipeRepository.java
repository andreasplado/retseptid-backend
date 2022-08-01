package com.kook.reptseptid.repository;

import com.kook.reptseptid.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    // UPDATE
}
