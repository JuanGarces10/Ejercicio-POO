public class Trabajadores {
    protected String nombre;
    protected int cedula;
    protected Compania_productora productora;
    Radios radio;
    Lugar_trabajo l_trabajo;
    public String getNombre() {
        return nombre;
    }
    public int getCedula() {
        return cedula;
    }
    public Compania_productora getProductora() {
        return productora;
    }
    public Radios getRadio() {
        return radio;
    }
    public Lugar_trabajo getL_trabajo() {
        return l_trabajo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public void setProductora(Compania_productora productora) {
        this.productora = productora;
    }
    public void setRadio(Radios radio) {
        this.radio = radio;
    }
    public void setL_trabajo(Lugar_trabajo l_trabajo) {
        this.l_trabajo = l_trabajo;
    }

    public Trabajadores(){
        
    }

    public Trabajadores(String nombre, int cedula, Compania_productora productora, Radios radio,
            Lugar_trabajo l_trabajo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.productora = productora;
        this.radio = radio;
        this.l_trabajo = l_trabajo;
    }
    
}
