public class Lugar_trabajo {
    protected String conductores;
    protected String operadores;
    protected String productores;

    Trabajadores trabajadores;
    Emision emision;
    public String getConductores() {
        return conductores;
    }
    public String getOperadores() {
        return operadores;
    }
    public String getProductores() {
        return productores;
    }
    public Trabajadores getTrabajadores() {
        return trabajadores;
    }
    public Emision getEmision() {
        return emision;
    }
    public void setConductores(String conductores) {
        this.conductores = conductores;
    }
    public void setOperadores(String operadores) {
        this.operadores = operadores;
    }
    public void setProductores(String productores) {
        this.productores = productores;
    }
    public void setTrabajadores(Trabajadores trabajadores) {
        this.trabajadores = trabajadores;
    }
    public void setEmision(Emision emision) {
        this.emision = emision;
    }

    public Lugar_trabajo(){
        
    }


    public Lugar_trabajo(String conductores, String operadores, String productores, Trabajadores trabajadores,
            Emision emision) {
        this.conductores = conductores;
        this.operadores = operadores;
        this.productores = productores;
        this.trabajadores = trabajadores;
        this.emision = emision;
    }

    

}
