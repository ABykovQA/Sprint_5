import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline feline = new Feline();



    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        assertEquals(1, lion.getKittens());
    }

    @Test
    void doesHaveManeMaleTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    void doesHaveManeFemaleTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void incorrectLionSexTest() throws Exception   {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("квадробер", feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}