package farmacia;

public class extencion  extends farmacia{
    private String ciudad;
    private empleado gerente;

    //Constructor

    extencion(){}
    extencion(int id, String name, String direccion, String numeroTel, String ciudad, empleado gerente){
        super(id,name,direccion,numeroTel);
        this.setCiudad(ciudad);
        this.setGerente(gerente);

    }
   //Setters


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setGerente(empleado gerente) {
        this.gerente = gerente;
    }

    //Getters


    public empleado getGerente() {
        return gerente;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Farmacia =[" + "Id= " + this.getId() + ", Name= "+ this.getName() +", Direccion= "+ this.getDireccion() +
                ", Numero telefono = " + this.getNumeroTel()+ " Ciuddad= " + this.getCiudad() + "Gerente =" + this.getGerente()+ ']';
    }
}


