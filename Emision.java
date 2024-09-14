import java.sql.Time;
import java.util.*;
public class Emision {
    protected Date fecha;
    protected Time hora_inicio;
    protected Time hora_finalizo;
    protected Time duracion;

    Programa programa;
    Encuesta encuenta;
    Lugar_trabajo l_trabajo;

    public Date getFecha() {
        return fecha;
    }
    public Time getHora_inicio() {
        return hora_inicio;
    }
    public Time getHora_finalizo() {
        return hora_finalizo;
    }
    public Time getDuracion() {
        return duracion;
    }
    public Programa getPrograma() {
        return programa;
    }
    public Encuesta getEncuenta() {
        return encuenta;
    }
    public Lugar_trabajo getL_trabajo() {
        return l_trabajo;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }
    public void setHora_finalizo(Time hora_finalizo) {
        this.hora_finalizo = hora_finalizo;
    }
    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }
    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
    public void setEncuenta(Encuesta encuenta) {
        this.encuenta = encuenta;
    }
    public void setL_trabajo(Lugar_trabajo l_trabajo) {
        this.l_trabajo = l_trabajo;
    }


    public Emision(){
        
    }
    
    public Emision(Date fecha, Time hora_inicio, Time hora_finalizo, Time duracion, Programa programa,
            Encuesta encuenta, Lugar_trabajo l_trabajo) {
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_finalizo = hora_finalizo;
        this.duracion = duracion;
        this.programa = programa;
        this.encuenta = encuenta;
        this.l_trabajo = l_trabajo;
    }

}
