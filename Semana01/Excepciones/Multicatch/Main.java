package Multicatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Leer archivo
            BufferedReader lector = new BufferedReader(new FileReader("datos.txt"));
            String linea = lector.readLine();
            lector.close();

            // División
            int numero = Integer.parseInt(linea);
            int resultado = 100 / numero; // Si número es 0, lanza ArithmeticException

            System.out.println("Resultado: " + resultado);
        } catch (IOException | ArithmeticException e) {
            System.out.println("(MC) Se produjo una excepción: " + e.getClass().getSimpleName());
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
}
