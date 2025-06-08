public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        Auto auto = new Auto(motor); // Se inyecta la dependencia desde fuera
        auto.arrancar();
    }
}