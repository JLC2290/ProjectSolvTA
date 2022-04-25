package farmacia.People;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Empleado extends Persona {

    private LocalDate startDate;
    private BigDecimal salary;
    private boolean isActive;


    //Constructor

    public Empleado(){

    }

    public Empleado(long id, String firstName, String lastName, LocalDate startDate, BigDecimal salary, boolean isActive) {
        super(id, firstName, lastName);
        this.startDate = startDate;
        this.salary = salary;
        this.isActive = isActive;
    }


    public Empleado(long id, String firstName, String lastName) {
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}