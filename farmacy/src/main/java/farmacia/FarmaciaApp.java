package farmacia;
import com.Solvd.exeptions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Date;


public class FarmaciaApp {

    private static final Logger LOGGER = LogManager.getLogger(FarmaciaApp.class);

    public static void main(String[] args) {


        Mutual mutual1 = new Mutual("Ioscor","Avenida falsa 123");
        Mutual mutual2 = new Mutual("SPS","Avenida falsa 321");


        Product product1 = new Product("Shampoo","Head & Shoulders", 122.00,10);
        Canasto canasto1 = new Canasto();
        Canasto canasto2 = new Canasto();
        Costumer client1 = new Costumer("Jose", 32, mutual1 ,001,canasto1);
        Costumer client2 = new Costumer("Juan", 35, mutual2 , 002,canasto2);
        Cajero cajero1 = new Cajero("Julian",38,3800.00,01);
        Cajero cajero2 = new Cajero("Jorge",28,3800.00,02);


        farmacia farmacia1 = new farmacia();


        farmacia1.addCajeroStation(cajero1);
        farmacia1.addCostumerInQueue(client1);
        farmacia1.addCajeroStation(cajero2);

     //Farmacy loggers and methods

        try {
            farmacia1.serveCostumer();
        } catch (EmptyQueueException | StationEmptyException | NoStationAvailableException e) {
            LOGGER.error(e.getMessage());
        }
        try {
            farmacia1.finishService(cajero1);
        } catch (StationEmptyException e) {
            LOGGER.error(e.getMessage());
        }
        //Throw error because there aren't people in the queue
        try {
            farmacia1.serveCostumer();
        } catch (EmptyQueueException | StationEmptyException | NoStationAvailableException e) {
            LOGGER.error(e.getMessage());
        }
        farmacia1.addCostumerInQueue(client2);
        try {
            farmacia1.serveCostumer();
        } catch (EmptyQueueException | StationEmptyException | NoStationAvailableException e) {
            LOGGER.error(e.getMessage());
        }









    //Product loggers and methods
        try {
            canasto1.getProduct(1);
        } catch (ProductNotFoundException e) {
            LOGGER.error(e.getMessage());
        }

        try {
            canasto1.addProduct(new Product("Perfume","Devon",360.00,3));
        } catch (CarritoFullException e) {
            LOGGER.error(e.getMessage());
        }
        try {
            canasto1.getProduct();
        } catch (CarritoVacioException e) {
            LOGGER.error(e.getMessage());
        }

        try {
            canasto1.removeProduct("Shampoo");
        } catch (ProductNotFoundException e) {
            LOGGER.error(e.getMessage());
        }

        try {
            //Should throw an error
            canasto1.removeProduct("Shampoo");
        } catch (ProductNotFoundException e) {
            LOGGER.error(e.getMessage());
        }
        try {
            canasto1.getProduct();
        } catch (CarritoVacioException e) {
            LOGGER.error(e.getMessage());
        }

        try {
            client1.getCart().addProduct(new Product("Leche","Arcor",350.00,2));
        } catch (CarritoFullException e) {
            LOGGER.error(e.getMessage());
        }
        try {
            canasto1.getProduct();
        } catch (CarritoVacioException e) {
            LOGGER.error(e.getMessage());
        }




    }
}
