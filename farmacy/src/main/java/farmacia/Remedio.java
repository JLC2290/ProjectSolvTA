package farmacia;

import java.util.Calendar;

public class Remedio extends Product {
    private String tipoRemedio;
    private String description;


    //Constructor

    Remedio() {
    }

    Remedio(String nombre, String marca, double precio, int stock, String tipoRemedio, String description) {
        super(nombre, marca, precio, stock);
        this.setTipoRemedio(tipoRemedio);
        this.setDescription(description);
    }

    //Setters


    public void setDescription(String description) {
        this.description = description;
    }

    public void setTipoRemedio(String tipoRemedio) {
        this.tipoRemedio = tipoRemedio;
    }

    //Getters


    public String getDescription() {
        return description;
    }

    public String getTipoRemedio() {
        return tipoRemedio;
    }

    @Override
    public String toString(){
        return "Remedio [" + " ID='"+ this.getId() + " Nombre='"+ this.getNombre() +" Marca='" + this.getMarca() +
                " Precio='"+ this.getPrecio() + " Stock=' " + this.getStock() + " Tipo de Remedio = " + this.getTipoRemedio() + " Descripcion= "+ this.getDescription() + ']';
    }

}
