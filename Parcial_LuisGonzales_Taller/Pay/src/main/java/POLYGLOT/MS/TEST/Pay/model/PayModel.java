package POLYGLOT.MS.TEST.Pay.model;
 
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "pago")
public class PayModel implements Serializable {
 
    private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idArticulo")
private Integer idArticulo;

@Column(name = "nombre")
private String nombre;

@Column(name = "precio")
private double precio;


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

    public double getPrecio() {
        return precio;
    }

}

  

  