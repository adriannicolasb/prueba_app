package VO;

public class ClienteVO {

/*Todo los atributos*/
    int id;
    String nombre;
    String cuit;
    String categoria;

public ClienteVO(){}

/*Todo los codigos get*/
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCuit(){
        return cuit;
    }
    public String getCategoria(){
        return categoria;
    }


/*Todo los codigos set*/
    public void setId(int id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCuit(String cuit){
        this.cuit = cuit;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

}
