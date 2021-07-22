package guru.springframework.domain;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    void getId() {
        Long idVal=4l;
        category.setId(idVal);
        assertEquals(idVal,category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}