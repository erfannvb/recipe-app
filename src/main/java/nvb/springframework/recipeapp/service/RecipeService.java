package nvb.springframework.recipeapp.service;

import nvb.springframework.recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
