import java.time.LocalDate;
import Intefaces.Reproducirvideos;
import Intefaces.Sonportables;
import Intefaces.Tomanfotos;

public class CamaraFotografica extends Producto implements Tomanfotos, Reproducirvideos, Sonportables, Comparable<Producto>{
    
    CamaraFotografica(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("CamaraFotografica");
    }

    @Override
    public void tomarFoto() {
        System.out.println("Tomando una foto con mi " + getTipo()+" " + getMarca());
    }

    @Override
    public void reproducirVideo() {
        System.out.println("Reproduciendo video desde mi "+getTipo()+ " "+ getMarca());
    }

    @Override
    public void portable() {
        System.out.println("Llevando mi "+getTipo()+" "+getMarca());
    }

    @Override
    public int compareTo(Producto o) {
        if (o.getFechaFabricacion().isBefore(getFechaFabricacion())){
            return 1;
        }
        else if (o.getFechaFabricacion().isAfter(getFechaFabricacion())){
            return -1;
        }
        else{
            return 0;
        }
    }
}
