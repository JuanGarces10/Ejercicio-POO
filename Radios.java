import java.util.List;
public class Radios {
    protected int id;
    protected String nombre;
    protected String frecuencia;
    protected String tipo_frecuencia;
    protected List<Programa> listaDeProgramas;
    protected List<Trabajadores> listaDetrabajadores;
    public String getNombre() {
        return nombre;
    }
    public String getFrecuencia() {
        return frecuencia;
    }
    public String getTipo_frecuencia() {
        return tipo_frecuencia;
    }
    public List<Programa> getListaDeProgramas() {
        return listaDeProgramas;
    }
    public List<Trabajadores> getListaDetrabajadores() {
        return listaDetrabajadores;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
    public void setTipo_frecuencia(String tipo_frecuencia) {
        this.tipo_frecuencia = tipo_frecuencia;
    }
    public void setListaDeProgramas(List<Programa> listaDeProgramas) {
        this.listaDeProgramas = listaDeProgramas;
    }
    public void setListaDetrabajadores(List<Trabajadores> listaDetrabajadores) {
        this.listaDetrabajadores = listaDetrabajadores;
    }


    public Radios(){
        
    }
    
    public Radios(String nombre, String frecuencia, String tipo_frecuencia, List<Programa> listaDeProgramas,
            List<Trabajadores> listaDetrabajadores) {
        this.nombre = nombre;
        this.frecuencia = frecuencia;
        this.tipo_frecuencia = tipo_frecuencia;
        this.listaDeProgramas = listaDeProgramas;
        this.listaDetrabajadores = listaDetrabajadores;
    }

    
    
 }
