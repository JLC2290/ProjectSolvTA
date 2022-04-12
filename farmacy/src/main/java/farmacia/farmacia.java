package farmacia;
import com.Solvd.exeptions.NoStationAvailableException;
import com.Solvd.exeptions.StationEmptyException;
import com.Solvd.exeptions.EmptyQueueException;
import java.util.*;

public class farmacia {
    private int id;
    private String name;
    private String direccion;
    private String numeroTel;
    private Map <Cajero, String> stations = new HashMap<>();
    private Queue<Costumer> clients = new LinkedList<>();


    //Constructor

farmacia(){}

    public farmacia(int id, String name, String direccion, String numeroTel){
      this.setId(id);
      this.setName(name);
      this.setDireccion(direccion);
      this.setNumeroTel(numeroTel);

    }
  //Setters


    public void setId(int id) {
        this.id = id;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    //Getters


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumeroTel() {
        return numeroTel;
    }


    //Collections and Exceptions of Cajero

    public void addCajeroStation(Cajero cajero){
      stations.put(cajero,"vacio");
    }

    public ArrayList<Integer> getStationCajero() throws StationEmptyException{
      if (stations.isEmpty()){
          throw new StationEmptyException("La estacion esta vacia");
      }
       ArrayList<Integer> cajeros = new ArrayList<>();
        for (Cajero cajero : stations.keySet()){
            cajeros.add(cajero.getCajeroId());
        }
        return cajeros;
    }

    public void Serving (Cajero cajero){
     stations.put(cajero,"En uso");
    }

    public void finishService(Cajero station) throws StationEmptyException{
    if (stations.get(station).equals("En uso")){
        stations.put(station,"vacio");
    } else {
        throw new StationEmptyException("La estacion esta vacia");
    }
}
    //Collections and Exceptions of Costumer

    public void addCostumerInQueue(Costumer cliente) {
        clients.add(cliente);
    }

    public void removeCostumer() throws EmptyQueueException {
        if (clients.isEmpty()) {
            throw new EmptyQueueException("No hay clientes en fila.");
        }
        System.out.println(clients.poll().getName() + " fue removido.");
    }
    public void serveCostumer() throws EmptyQueueException, StationEmptyException, NoStationAvailableException {
        boolean emptyStation = false;

        if (clients.isEmpty()) {

            throw new EmptyQueueException("No hay clientes en fila.");
        }
        if (getStationCajero().size() != 0) {
            for (Map.Entry<Cajero, String> station : stations.entrySet()) {

                if (station.getValue().equals("vacio")) {
                    emptyStation = true;
                    System.out.println("Atendiendo Cliente.");
                    Serving(station.getKey());
                    removeCostumer();
                    break;
                }
            }
        }
        if (!emptyStation) {
            throw new NoStationAvailableException("Todas las estaciones estan ocupadas.");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        farmacia that = (farmacia) o;
        return Objects.equals(stations, that.stations) && Objects.equals(clients, that.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stations, clients);
    }

}
