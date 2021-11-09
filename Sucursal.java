public class Sucursal {
    private int codigo;
    private String direccion;
    private String ciudad;
    private String pais;

    Sucursal(int codigo, String direccion, String ciudad, String pais){
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }
}
