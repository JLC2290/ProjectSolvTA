package farmacia.Utils;

public class Remedio extends Product {
    private String tipoRemedio;
    private String description;


    //Constructor

    Remedio() {
    }

    public Remedio(String nombre, String marca, double precio, String tipoRemedio, String description) {
        super(nombre, marca, precio);
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
                " Precio='"+ this.getPrecio() + " Stock=' " + " Tipo de Remedio = " + this.getTipoRemedio() + " Descripcion= "+ this.getDescription() + ']';
    }

}
