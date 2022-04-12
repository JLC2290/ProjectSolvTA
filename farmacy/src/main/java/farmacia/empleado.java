package farmacia;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class empleado extends persona implements IShift{
    private static final Logger LOGGER = LogManager.getLogger(empleado.class);
    private double sueldo;



    //Constructor

    empleado() {

    }
        empleado( String Name,int Age,double sueldo){
        super(Name, Age);
        this.setSueldo(sueldo);

        }


    //Setter



    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }



    //Geters



    public double getSueldo(){
        return this.sueldo;
    }



    @Override
    public String toString() {
        return "Empleado[ " + ", Name='"+ this.getName() +", Age='"+ this.getAge() +
                " Sueldo= "+ this.getSueldo() + '}';
    }
    @Override
    public void goShift() {
        LOGGER.info("Starting Shift");
    }

}
