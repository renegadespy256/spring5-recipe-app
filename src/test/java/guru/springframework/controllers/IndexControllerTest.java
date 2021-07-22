package guru.springframework.controllers;

import guru.springframework.domain.Recipe;
import guru.springframework.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;

class IndexControllerTest {

    IndexController indexController;

    @Mock
    RecipeService recipeService;
    @Mock
    Model model;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        indexController=new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {
        String viewName = indexController.getIndexPage(model);
        assertEquals(viewName,"index");
        Mockito.verify(recipeService,Mockito.times(1)).getRecipes();
        Mockito.verify(model,Mockito.times(1)).addAttribute(eq("recipes"),anyList());
    }
}