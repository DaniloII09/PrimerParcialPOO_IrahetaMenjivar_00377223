package Articulo;

public class Laptop extends Articulo implements DatosProducto{
    private String memoriaRAM;
    private String tamanio;

    public Laptop(Articulo articulo, String memoriaRAM, String tamanio)
    {
        super(articulo);
        this.memoriaRAM = memoriaRAM;
        this.tamanio = tamanio;
    }

    public float obtenerPrecio(float precio)
    {
        return precio;
    }

    public String obtenerDescripcion(String descripcion)
    {
        return descripcion;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

}
