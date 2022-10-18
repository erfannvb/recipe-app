package nvb.springframework.recipeapp.repository;

import nvb.springframework.recipeapp.model.Category;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class CategoryRepositoryIT {

    @Autowired
    CategoryRepository categoryRepository;

    @Test
    void findByDescriptionAmerican() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        assertEquals("American", categoryOptional.get().getDescription());
    }

    @Test
    void findByDescriptionItalian() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("Italian");
        assertEquals("Italian", categoryOptional.get().getDescription());
    }

    @Test
    void findByDescriptionMexican() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("Mexican");
        assertEquals("Mexican", categoryOptional.get().getDescription());
    }

}