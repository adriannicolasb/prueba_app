package VO;

public class ProductoVO {

/*Todo los atributos*/
    int id;
    String descripcion;
    double precio;
    double stock;

public ProductoVO(){}

/*Todo los codigos get*/
    public int getId(){
        return id;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getPrecio(){
        return precio;
    }
    public double getStock(){
        return stock;
    }


/*Todo los codigos set*/
    public void setId(int id){
        this.id = id;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setStock(double stock){
        this.stock = stock;
    }

}
