package Main.Nivel_1.Ejercicio_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {


@ParameterizedTest
    @CsvSource({
            "44444444, M",
            "87654321, E",
            "12345678, Z",
            "11111111, B",
            "55553333, P",
            "22222222, A",
            "88888888, K",
            "68474456, Q",
            "77777777, J",
            "32476990, A"
    })

    void testCalcularLetraDNI(int dni, char expectedLetter) {

        char calculatedLetter = CalculoDni.calculateDNILetter(dni);

        assertEquals(expectedLetter, calculatedLetter);
    }

}