package project1;

public class Marca {
    private String nombre;
    private int nrDeModelos;
    private int anioLanzamiento;
    private String codigoIdentificador;

    public Marca(String nombre, int nrDeModelos, int anioLanzamiento, String codigoIdentificador) {
        this.nombre = nombre;
        this.nrDeModelos = nrDeModelos;
        this.anioLanzamiento = anioLanzamiento;
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nombre='" + nombre + '\'' +
                ", nrDeModelos=" + nrDeModelos +
                ", anioLanzamiento=" + anioLanzamiento +
                ", codigoIdentificador='" + codigoIdentificador + '\'' +
                '}';
    }
}
