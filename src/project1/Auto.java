package project1;

public class Auto {
    private String color;
    private Marca marca;
    private String chasis;
    private Propietario propietario;
    private int velocidadMaxima;
    private int velocidadActual;
    private int numeroPuertas;
    private boolean tieneTechoSolar;
    private int numeroMarchas;
    private int marchaActual;
    private boolean tieneTransmisionAutomatica;
    private double capacidadTanque;
    private double nivelCombustible;

    public Auto(Marca marca, String color, Propietario propietario, int velocidadMaxima, int velocidadActual, int numeroPuertas, boolean tieneTechoSolar, int numeroMarchas, boolean tieneTransmisionAutomatica, int marchaActual, String chasis) {
        this.marca = marca;
        this.color = color;
        this.propietario = propietario;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.numeroPuertas = numeroPuertas;
        this.tieneTechoSolar = tieneTechoSolar;
        this.numeroMarchas = numeroMarchas;
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
        this.marchaActual = marchaActual;
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneTechoSolar() {
        return tieneTechoSolar;
    }

    public void setTieneTechoSolar(boolean tieneTechoSolar) {
        this.tieneTechoSolar = tieneTechoSolar;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isTieneTransmisionAutomatica() {
        return tieneTransmisionAutomatica;
    }

    public void setTieneTransmisionAutomatica(boolean tieneTransmisionAutomatica) {
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }

    public int getMarchaActual() {
        return marchaActual;
    }

    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        if (capacidadTanque <= 0) {
            throw new IllegalArgumentException("La capacidad del tanque debe ser mayor que cero.");
        }
        this.capacidadTanque = capacidadTanque;
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(double nivelCombustible) {
        if (nivelCombustible < 0 || nivelCombustible > capacidadTanque) {
            throw new IllegalArgumentException("Nivel de combustible no válido.");
        }
        this.nivelCombustible = nivelCombustible;
    }

    public void acelerar() {
        this.velocidadActual = this.velocidadActual + 1;
    }

    public void frenar() {
        this.velocidadActual = 0;
    }


    public void incrementarMarcha() {
        if (this.marchaActual < this.numeroMarchas) {
            this.marchaActual++;
        }
    }

    public void reducirMarcha() {
        if (marchaActual <= 1) {
            marchaActual = 0;
        }else {
            this.marchaActual--;
        }
    }


    public double calcularAutonomia(double consumoMedio) {
        if (consumoMedio <= 0) {
            throw new IllegalArgumentException("El consumo debe ser mayor que cero.");
        }

        double autonomia = (capacidadTanque / (consumoMedio / 100)) * 100;

        return Math.round(autonomia * 100.0) / 100.0;
    }

    public void mostrarVolumenCombustible() {
        System.out.printf("Nivel de combustible: %.2f litros de %.2f litros (%.2f%%)\n",
                nivelCombustible,
                capacidadTanque,
                (nivelCombustible / capacidadTanque) * 100);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", marca=" + marca +
                ", chasis='" + chasis + '\'' +
                ", propietario=" + propietario +
                ", velocidadMaxima=" + velocidadMaxima +
                ", velocidadActual=" + velocidadActual +
                ", numeroPuertas=" + numeroPuertas +
                ", tieneTechoSolar=" + tieneTechoSolar +
                ", numeroMarchas=" + numeroMarchas +
                ", marchaActual=" + marchaActual +
                ", tieneTransmisionAutomatica=" + tieneTransmisionAutomatica +
                ", capacidadTanque=" + capacidadTanque +
                ", nivelCombustible=" + nivelCombustible +
                '}';
    }
}
