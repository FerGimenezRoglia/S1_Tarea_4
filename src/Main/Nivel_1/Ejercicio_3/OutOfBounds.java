package Main.Nivel_1.Ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class OutOfBounds {

    public static void giveException() {

        int[] array = {1, 2, 3,4};

        int value = array[10]; // ----> ArrayIndexOutOfBoundsException
    }
}

