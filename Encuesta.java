

public class Encuesta {
    protected int total_encuentados;
    protected int aprobaciones;
    protected int rechazo;
    protected int cantidad_diferencia;
    
    Programa programa;
    Compania_productora productora;


    public int getTotal_encuentados() {
        return total_encuentados;
    }
    public int getAprobaciones() {
        return aprobaciones;
    }
    public int getRechazo() {
        return rechazo;
    }
    public int getCantidad_diferencia() {
        return cantidad_diferencia;
    }
    public Programa getPrograma() {
        return programa;
    }
    public Compania_productora getProductora() {
        return productora;
    }
    public void setTotal_encuentados(int total_encuentados) {
        this.total_encuentados = total_encuentados;
    }
    public void setAprobaciones(int aprobaciones) {
        this.aprobaciones = aprobaciones;
    }
    public void setRechazo(int rechazo) {
        this.rechazo = rechazo;
    }
    public void setCantidad_diferencia(int cantidad_diferencia) {
        this.cantidad_diferencia = cantidad_diferencia;
    }
    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
    public void setProductora(Compania_productora productora) {
        this.productora = productora;
    }


    public Encuesta(){
        
    }


    public Encuesta(int total_encuentados, int aprobaciones, int rechazo, int cantidad_diferencia, Programa programa,
            Compania_productora productora) {
        this.total_encuentados = total_encuentados;
        this.aprobaciones = aprobaciones;
        this.rechazo = rechazo;
        this.cantidad_diferencia = cantidad_diferencia;
        this.programa = programa;
        this.productora = productora;
    }
    
    
}