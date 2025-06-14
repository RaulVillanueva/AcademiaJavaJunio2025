package Semana02.Singleton;

public class Main {
    public static void main(String[] args) {
        // Ambas llamadas devuelven la misma instancia
        ConexionBD conexion1 = ConexionBD.getInstancia();
        ConexionBD conexion2 = ConexionBD.getInstancia();

        // Prueba de que son la misma instancia
        System.out.println(conexion1 == conexion2); // true

        conexion1.consultar();
    }
}