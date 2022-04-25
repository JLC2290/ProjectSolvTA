package farmacia;
import Enums.ESpeciality;
import com.Solvd.exeptions.*;
import farmacia.People.Costumer;
import farmacia.People.Farmaceutico;
import farmacia.Utils.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;


public class FarmaciaApp {

    private static final Logger LOGGER = LogManager.getLogger(FarmaciaApp.class);

    public static void main(String[] args) {

        final RecipeCheck recepy = new RecipeCheck();


        //initializing farmacia
        Farmacia farmacia1 = new Farmacia("Farmacia Arequipa","Arequipa 1xx9");
        LOGGER.info(farmacia1.toString());

        //initializing Producto
        Product product1 = new Product("Shampoo","Head & Shoulders", 122.00);

        //initializing Remedio
        Remedio remedio1 = new Remedio("Hipoglos","Adromaco",300.00,"Crema","Pomaga 100g");

        //initializing canasto
        Canasto canasto1 = new Canasto();
        Canasto canasto2 = new Canasto();

        //initializing cliente
        Costumer client1 = new Costumer(1,"Jose", "Kilo",  "SPS",canasto1);
        Costumer client2 = new Costumer(2,"Juan", "Hosey", "IOSCOR",canasto2);
        Costumer client3 = new Costumer(3,"Pedro", "Jamal", "",canasto2);


        //initializing recetas
        Receta receta1 = recepy.generarReceta(farmacia1, LocalDate.now(), LocalTime.now(),"Ulises",client1,remedio1, BigDecimal.valueOf(2000));
        Receta receta2 = recepy.generarReceta(farmacia1, LocalDate.now(), LocalTime.now(),"Ibarra",client1,remedio1, BigDecimal.valueOf(2000));

        try {

            Receta receta3 = recepy.generarReceta(farmacia1, LocalDate.now(), LocalTime.now(), "Ibarra", client3,remedio1, BigDecimal.valueOf(2000));
        } catch (NoMutualException e) {
            LOGGER.error(e);
        }


        //initializing Farmaceutico

       Farmaceutico far1 = new Farmaceutico (1,"Ariel", "Alan", ESpeciality.PER_FAC);
        Farmaceutico far2 = new Farmaceutico (2,"Farti", "Refa", ESpeciality.PER_TEC);
        Farmaceutico far3 = new Farmaceutico (3,"Gomos", "Pirel", ESpeciality.PER_FAC);
        Farmaceutico far4 = new Farmaceutico (4,"Tarde", "Guaro", ESpeciality.PER_AUX);


        //Remove Employee from the list

        try {
            farmacia1.removeFarmaceutico(far4);
        } catch (EmployeeNotFoundException e) {
            LOGGER.error(e.getMessage());
        }


        //Adding farmaceutico to farmacia

        farmacia1.addFarmaceutico(far1);
        farmacia1.addFarmaceutico(far2);
        farmacia1.addFarmaceutico(far3);
        farmacia1.addFarmaceutico(far4);

        farmacia1.addCostumerInQueue(client1);
        farmacia1.addCostumerInQueue(client2);
        farmacia1.addCostumerInQueue(client3);



        //Product loggers and methods
        try {
            canasto1.getProduct(1);
        } catch (ProductNotFoundException e) {
            LOGGER.error(e.getMessage());
        }

        try {
            canasto1.addProduct(new Product("Perfume","Devon",360.00));
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
            client1.getCart().addProduct(new Product("Leche","Arcor",350.00));
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
