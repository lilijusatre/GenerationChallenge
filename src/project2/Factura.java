package project2;

public class Factura {
    private String numero;
    private String descripcion;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numero, String descripcion, int cantidad, double precioPorArticulo) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = Math.max(cantidad, 0);
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = Math.max(precioPorArticulo, 0.0);
    }

    public double getTotalFactura() {
        double total = cantidad * precioPorArticulo;
        if( total <= 0 || precioPorArticulo <= 0 ) {
           return 0.0;
        }else {
            return total;
        }
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numero='" + numero + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioPorArticulo=" + precioPorArticulo +
                '}';
    }
}
