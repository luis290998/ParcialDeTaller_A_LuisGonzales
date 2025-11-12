package POLYGLOT.MS.TEST.Pay.dto;
 


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArticulo;

    private String nombre;
    private double pago;

    public Pago() {}

    public Pago(Integer idArticulo, String nombre, double pago) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.pago = pago;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
}
