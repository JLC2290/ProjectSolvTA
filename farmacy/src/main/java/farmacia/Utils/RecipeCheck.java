package farmacia.Utils;

import com.Solvd.exeptions.NoMutualException;
import farmacia.Interfaces.IRecepy;
import farmacia.People.Costumer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class RecipeCheck implements IRecepy {

    @Override
    public Receta generarReceta(
            Farmacia farmacia, LocalDate date, LocalTime time, String docName, Costumer costumer, Remedio remedio, BigDecimal cost){

        if (costumer.getMutual().isEmpty()){
            throw new NoMutualException("Cliente no tiene mutual");
        }

        Receta receta = new Receta(farmacia,date,time,docName,costumer,remedio,cost);
        return receta;

    };
}
