package farmacia;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Cajero extends empleado {

    private int cajeroId;
    private static final Logger LOGGER = LogManager.getLogger(Cajero.class);


    //Constructor

    public Cajero( String Name,int Age,double sueldo,Integer cajeroId) {
        super(Name,Age,sueldo);
        this.cajeroId = cajeroId;
    }




    public Integer getCajeroId() {
        return cajeroId;
    }

    public void goShift() {
        LOGGER.info("Turning On register.");}

    public void beginningShift() {
        LOGGER.info("Charging to clients");
    }
    public void endingShift() {
        LOGGER.info("Turning off the cash register, counting the money.");
    }



}
