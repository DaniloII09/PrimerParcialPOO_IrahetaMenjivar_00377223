package Articulo;

public class Telefono extends Articulo implements DatosProducto {
    private String sistemaOperativo;
    private String ringtone;

    public Telefono(Articulo articulo, String sistemaOperativo, String ringtone)
    {
        super(articulo);
        this.sistemaOperativo = sistemaOperativo;
        this.ringtone = ringtone;
    }

    public float obtenerPrecio(float precio)
    {
        return precio;
    }

    public String obtenerDescripcion(String descripcion)
    {
        return descripcion;
    }

    public String getSistemaOperativo()
    {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getRingtone() {
        return ringtone;
    }

    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
    }

}
