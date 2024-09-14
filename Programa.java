import java.util.List;

public class Programa {
    protected String nombre_programa;
    protected boolean repeticion;
    protected List<Emision> emisiones;
    protected List<Encuesta> encuestas;
    Radios radio;
    Generos genero;

    public String getNombre_programa() {
        return nombre_programa;
    }
    public boolean isRepeticion() {
        return repeticion;
    }
    public List<Emision> getEmisiones() {
        return emisiones;
    }
    public List<Encuesta> getEncuestas() {
        return encuestas;
    }
    public Radios getRadio() {
        return radio;
    }
    public Generos getGenero() {
        return genero;
    }
    public void setNombre_programa(String nombre_programa) {
        this.nombre_programa = nombre_programa;
    }
    public void setRepeticion(boolean repeticion) {
        this.repeticion = repeticion;
    }
    public void setEmisiones(List<Emision> emisiones) {
        this.emisiones = emisiones;
    }
    public void setEncuestas(List<Encuesta> encuestas) {
        this.encuestas = encuestas;
    }
    public void setRadio(Radios radio) {
        this.radio = radio;
    }
    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public Programa(){
        
    }
    
    public Programa(String nombre_programa, boolean repeticion, List<Emision> emisiones, List<Encuesta> encuestas,
            Radios radio, Generos genero) {
        this.nombre_programa = nombre_programa;
        this.repeticion = repeticion;
        this.emisiones = emisiones;
        this.encuestas = encuestas;
        this.radio = radio;
        this.genero = genero;
    }

    

    
}
