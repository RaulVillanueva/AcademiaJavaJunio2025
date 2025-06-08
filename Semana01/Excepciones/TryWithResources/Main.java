package TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader lector = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea = lector.readLine();
            System.out.println("Línea leída: " + linea);
        } catch (IOException e) {
            System.out.println("(TWR) Error leyendo el archivo: " + e.getMessage());
        }
        // El lector se cierra automáticamente aquí
    }
}
