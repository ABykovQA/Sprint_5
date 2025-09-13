import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class FelineTest {

    @Spy
    Feline feline = new Feline();

    @Test
    void eatMeatTest() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittensOneKittenTest() {
        assertEquals(1, feline.getKittens());
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "-2, -2"
    })
    void GetKittensIntCountKittensTest(int expected, int kittensCount) {
        assertEquals(expected, feline.getKittens(kittensCount));
    }
}

