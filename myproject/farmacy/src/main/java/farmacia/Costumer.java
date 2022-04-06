package farmacia;

public class Costumer extends persona implements IBuy{
    private Canasto canasto;
    private Mutual mutual;
    private int idnumber;

    //Constructor
    Costumer() {
    }

    public Costumer(String Name, int Age, Mutual mutual, int idnumber, Canasto canasto) {
        super(Name, Age);
        this.canasto= canasto;
        this.setMutual(mutual);
        this.setIdNumber(idnumber);
    }

//Setters




    public void setMutual(Mutual mutual) {
        this.mutual = mutual;
    }

    public void setIdNumber(int idnumber) {
        this.idnumber = idnumber;
    }

    //Getters


    public Canasto getCanasto() {
        return canasto;
    }

    public Mutual getMutual() {
        return this.mutual;
    }

    public int getIdnumber() {
        return idnumber;
    }

    //Metodos
    @Override
    public String toString() {
        return "Costumer{" + ", Name='" + this.getName() + ", Age='" + this.getAge() +
                ", Contac Number='" + "Afiliacion='" + this.getMutual() + "Cliente Mutual ID= " + this.getIdnumber() + '}';
    }

    @Override
    public void countOfProducts() {

    }

    @Override
    public void amountToPay() {

    }

    @Override
    public void paymentForms(String wayToPay) {

    }

    public Canasto getCart() {
        return canasto;
    }
}
