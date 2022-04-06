package farmacia;
import java.util.Objects;
import com.Solvd.exeptions.ProductNotFoundException;

public class Product {
    private int id = 0;
    private int productID;
    private String nombre;
    private String marca;
    private double precio;
    private int stock;



    //Constructor
    Product(){
        this.productID = id;
        id += 1;
    }

    Product(String nombre,String marca, double precio, int stock){
        id +=1;
        this.setNombre(nombre);
        this.setMarca(marca);
        this.setPrecio(precio);
        this.setStock(stock);
    }



    //Setters

    public void setId(int id){
        this.id=id;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
    }



    public void setStock(int stock) {
        this.stock = stock;
    }
//Getters

    public Integer getProductId() {
        return productID;

    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

//Metodos
     @Override
    public String toString(){
         return "Product[" + " ID='"+ this.getId() + " Nombre='"+ this.getNombre() +" Marca='" + this.getMarca() +
                   " Precio='"+ this.getPrecio() + " Stock='" + this.getStock() + ']';
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nombre, product.nombre) && Objects.equals(precio, product.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }
}








