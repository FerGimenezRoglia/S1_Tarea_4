package Main.Nivel_1.Ejercicio_2;

public class CalculoDni {

    public static char calculateDNILetter(int dni){

        char[] letters = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        int index = dni % 23;

        return letters[index];

    }

}
