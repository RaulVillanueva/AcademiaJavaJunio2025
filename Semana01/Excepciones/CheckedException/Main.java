package CheckedException;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            leerArchivo("archivo.txt");
        } catch (IOException e) {
            System.out.println("(CE) Excepción marcada capturada: " + e.getMessage());
        }
    }

    public static void leerArchivo(String nombreArchivo) throws IOException {
        FileReader lector = new FileReader(nombreArchivo); // Si el archivo no existe, lanza IOException
        lector.close();
    }
}