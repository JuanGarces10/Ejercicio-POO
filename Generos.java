import java.util.List;

public class Generos {
    protected String tipo_genero;
    protected List<Programa> listaDeProgramas;


    public String getTipo_genero() {
        return tipo_genero;
    }
    public List<Programa> getListaDeProgramas() {
        return listaDeProgramas;
    }
    public void setTipo_genero(String tipo_genero) {
        this.tipo_genero = tipo_genero;
    }
    public void setListaDeProgramas(List<Programa> listaDeProgramas) {
        this.listaDeProgramas = listaDeProgramas;
    }

    public Generos(){
        
    }
    public Generos(String tipo_genero, List<Programa> listaDeProgramas) {
        this.tipo_genero = tipo_genero;
        this.listaDeProgramas = listaDeProgramas;
    }
    
    
}
