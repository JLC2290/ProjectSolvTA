package farmacia.People;

import farmacia.Utils.Canasto;

public class Costumer extends Persona {
    private Canasto canasto;
    private String mutual;


    //Constructor
    Costumer() {
    }

    public Costumer(long id, String firstName, String lastName,String mutual, Canasto canasto) {
        super.setId(id);
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.canasto = canasto;
        this.mutual = mutual;


    }



    public String getMutual() {
        return mutual;
    }

    public void setMutual(String mutual) {
        this.mutual = mutual;
    }

    public Canasto getCanasto() {
        return canasto;
    }
    @Override
    public String toString() {
        return "Costumer{" + ", Name='" + this.getFirstName() + '}';
    }

    public Canasto getCart() {
        return canasto;
    }
}
