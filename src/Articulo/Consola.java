package Articulo;

public class Consola extends Articulo implements DatosProducto
{
    private String marca;
    private String juegoIncluido;


    public Consola(Articulo articulo, String marca, String juegoIncluido)
    {
        super(articulo);
        this.marca = marca;
        this.juegoIncluido = juegoIncluido;
    }

    public float obtenerPrecio(float precio) {
        return precio;
    }

    public String obtenerDescripcion(String descripcion) {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getJuegoIncluido() {
        return juegoIncluido;
    }

    public void setJuegoIncluido(String juegoIncluido) {
        this.juegoIncluido = juegoIncluido;
    }

}
