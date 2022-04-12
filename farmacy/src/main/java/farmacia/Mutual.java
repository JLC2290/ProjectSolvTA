package farmacia;



public class Mutual {
   private String name;
   private String address;

//Constructor

    Mutual(){}
    Mutual(String name, String address){
        this.setName(name);
        this.setAddress(address);
    }

    //Setters


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //getters


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Mutual [" + "Nombre =" + this.getName() + ",Direccion =" + this.getAddress() + "]";
    }

}