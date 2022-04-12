package farmacia;

public abstract class empleado extends persona implements IShift{
    private String cargo;
    private double sueldo;
    private String Turno;


    //Constructor

    empleado() {}
        empleado( String Name,int Age, String contacNumber, String cargo,double sueldo, String Turno){
            super(Name, Age);
            this.setCargo(cargo);
            this.setSueldo(sueldo);
            this.setTurno(Turno);
        }


    //Setter

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }
    //Geters

    public String getCargo(){
        return this.cargo;
    }

    public double getSueldo(){
        return this.sueldo;
    }
    public String getTurno(){
        return this.Turno;
    }


    @Override
    public String toString() {
        return "Empleado[ " + ", Name='"+ this.getName() +", Age='"+ this.getAge() +
                " Sueldo= "+ this.getSueldo() + " Turno= " + this.getTurno() +'}';
    }


}
