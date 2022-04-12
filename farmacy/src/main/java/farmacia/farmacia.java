package farmacia;

public class farmacia {
    private int id;
    private String name;
    private String direccion;
    private String numeroTel;


    //Constructor

farmacia(){}

    public farmacia(int id, String name, String direccion, String numeroTel){
      this.setId(id);
      this.setName(name);
      this.setDireccion(direccion);
      this.setNumeroTel(numeroTel);

    }
  //Setters


    public void setId(int id) {
        this.id = id;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    //Getters


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

}
