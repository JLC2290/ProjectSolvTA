package farmacia.Utils;

import farmacia.People.Costumer;
import farmacia.Utils.Farmacia;
import farmacia.Utils.Remedio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Receta {
    private LocalDate date;
    private LocalTime time;
    private Farmacia farmacia;
    private String docName;
    private Costumer costumer;
    private BigDecimal cost;
    private Remedio remedio;

    public Receta() {
    }

    public Receta(Farmacia farmacia, LocalDate date, LocalTime time, String docName, Costumer costumer,Remedio remedio, BigDecimal cost) {
        this.farmacia = farmacia;
        this.date = date;
        this.time = time;
        this.docName = docName;
        this.costumer = costumer;
        this.cost = cost;
        this.remedio = remedio;
    }


    public Remedio getRemedio() {
        return remedio;
    }

    public void setRemedio(Remedio remedio) {
        this.remedio = remedio;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "date=" + date +
                ", time=" + time +
                ", farmacia=" + farmacia +
                ", doctor=" + docName +
                ", costumer=" + costumer +
                ", remedio=" + remedio +
                ", cost=" + cost +
                '}';
    }
}
