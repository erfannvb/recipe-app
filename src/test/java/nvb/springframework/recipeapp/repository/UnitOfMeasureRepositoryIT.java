package nvb.springframework.recipeapp.repository;

import nvb.springframework.recipeapp.model.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Test
    void findByDescriptionTeaspoon() {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon", uomOptional.get().getDescription());
    }

    @Test
    void findByDescriptionCup() {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Cup");
        assertEquals("Cup", uomOptional.get().getDescription());
    }

    @Test
    void findByDescriptionDash() {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Dash");
        assertEquals("Dash", uomOptional.get().getDescription());
    }

    @Test
    void findByDescriptionEach() {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Each");
        assertEquals("Each", uomOptional.get().getDescription());
    }
}