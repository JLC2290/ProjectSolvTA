package farmacia.Utils;
import com.Solvd.exeptions.EmployeeNotFoundException;
import com.Solvd.exeptions.EmptyQueueException;
import farmacia.People.Costumer;
import farmacia.People.Farmaceutico;

import java.util.*;

public class Farmacia {

    private String name;
    private String direccion;

    private List<Farmaceutico> farmaceuticoList = new ArrayList<>();
    private Queue<Costumer> clients = new LinkedList<>();


    //Constructor

Farmacia(){}

    public Farmacia( String name, String direccion){
      this.setName(name);
      this.setDireccion(direccion);


    }
  //Setters




    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFarmaceuticoList(List<Farmaceutico> farmaceuticoList) {
        this.farmaceuticoList = farmaceuticoList;
    }

    //Getters


    public String getName() {
        return name;
    }



    public String getDireccion() {
        return direccion;
    }

    public List<Farmaceutico> getFarmaceuticoList() {
        return farmaceuticoList;
    }



    public void addFarmaceutico(Farmaceutico farmaceutico) {
        this.getFarmaceuticoList().add(farmaceutico);
    }

    public void removeFarmaceutico(Farmaceutico farmaceutico) {

        if (this.getFarmaceuticoList().contains(farmaceutico)) {
            this.getFarmaceuticoList().remove(farmaceutico);
        } else {
            throw new EmployeeNotFoundException("Employee not found.");
        }
    }

    @Override
    public String toString() {
        return "\nHospital information: " +
                "\nname: " + name +
                "\naddress: " + direccion;
    }


    //Collections and Exceptions of Costumer

    public void addCostumerInQueue(Costumer cliente) {
        clients.add(cliente);
    }

    public void removeCostumer() throws EmptyQueueException {
        if (clients.isEmpty()) {
            throw new EmptyQueueException("No hay clientes en fila.");
        }
        System.out.println(clients.poll().getFirstName() + " fue removido.");
    }



}
