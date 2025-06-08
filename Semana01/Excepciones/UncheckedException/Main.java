package UncheckedException;

public class Main {
    public static void main(String[] args) {
        int resultado = dividir(10, 0);
        System.out.println("(UCE) Resultado: " + resultado);
    }

    public static int dividir(int a, int b) {
        return a / b; // Lanza ArithmeticException si b es 0, en este caso debería manejarse la excepción no marcada
    }
}
