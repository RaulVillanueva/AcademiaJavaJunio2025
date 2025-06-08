class Auto {
    private Motor motor;

    // Inyección por constructor
    public Auto(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        motor.encender();
    }
}