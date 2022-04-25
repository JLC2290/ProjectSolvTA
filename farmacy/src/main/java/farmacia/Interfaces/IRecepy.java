package farmacia.Interfaces;

import farmacia.People.Costumer;
import farmacia.Utils.Farmacia;
import farmacia.Utils.Receta;
import farmacia.Utils.Remedio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public interface IRecepy {
     Receta generarReceta(
             Farmacia farmacia, LocalDate date, LocalTime time, String docName, Costumer costumer, Remedio remedio, BigDecimal cost);

}

