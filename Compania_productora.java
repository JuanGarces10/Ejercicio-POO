import java.util.*;
public class Compania_productora {
    protected  String numero_RFC;
    protected String nombre;
    protected  String telefonos;

    protected List<Encuesta> encuestas;
    protected List<Trabajadores> trabajadores;
    
    public String getNumero_RFC() {
        return numero_RFC;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefonos() {
        return telefonos;
    }
    public List<Encuesta> getEncuestas() {
        return encuestas;
    }
    public List<Trabajadores> getTrabajadores() {
        return trabajadores;
    }
    public void setNumero_RFC(String numero_RFC) {
        this.numero_RFC = numero_RFC;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }
    public void setEncuestas(List<Encuesta> encuestas) {
        this.encuestas = encuestas;
    }
    public void setTrabajadores(List<Trabajadores> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public Compania_productora(){
        
    }
    
    public Compania_productora(String numero_RFC, String nombre, String telefonos, List<Encuesta> encuestas,
            List<Trabajadores> trabajadores) {
        this.numero_RFC = numero_RFC;
        this.nombre = nombre;
        this.telefonos = telefonos;
        this.encuestas = encuestas;
        this.trabajadores = trabajadores;
    }
    

    
}
