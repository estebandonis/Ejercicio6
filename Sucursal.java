/**
 * Nos sirve para crear sucursales
 */

public class Sucursal {
    private int codigo;
    private String direccion;
    private String ciudad;
    private String pais;

    /**
     * Constructor de la clase
     * @param codigo
     * @param direccion
     * @param ciudad
     * @param pais
     */
    Sucursal(int codigo, String direccion, String ciudad, String pais){
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    /**
     * Obtenemos el codigo
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Obtenemos la direccion de la sucursal
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtenemos la ciudad de la sucursal
     * @return
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Obtenemos el pais de la sucursal
     * @return
     */
    public String getPais() {
        return pais;
    }
}
