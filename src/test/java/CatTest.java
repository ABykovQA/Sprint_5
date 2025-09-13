import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CatTest {

    @Mock
    Feline feline = new Feline();

    Cat cat = new Cat(feline);

    @Test
    void getSoundTest() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getFoodTest() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба") , cat.getFood());
    }
}