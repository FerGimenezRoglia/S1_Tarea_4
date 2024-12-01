package Main.Nivel_1.Ejercicio_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundsTest {

    @Test
    void ArrayIndexOutOfBoundsExceptionTest() {

        assertThrows(ArrayIndexOutOfBoundsException.class, OutOfBounds::giveException);
    }
}
