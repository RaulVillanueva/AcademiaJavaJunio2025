package Semana02.Singleton;

public class ConexionBD {

    // 1. Instancia privada y estática (inicialmente null)
    private static ConexionBD instancia;

    // 2. Constructor privado para evitar que se creen objetos desde fuera
    private ConexionBD() {
        System.out.println("Conectando a la base de datos...");
    }

    // 3. Método público y estático para obtener la instancia única
    public static ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    // Método de ejemplo
    public void consultar() {
        System.out.println("Ejecutando consulta...");
    }
}
