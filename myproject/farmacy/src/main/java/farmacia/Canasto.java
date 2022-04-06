package farmacia;
import java.util.LinkedList;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.Solvd.exeptions.ProductNotFoundException;
import com.Solvd.exeptions.CarritoFullException;
import com.Solvd.exeptions.CarritoVacioException;

public class Canasto {

    private LinkedList <Product> products = new LinkedList<>();
    private static final Logger LOGGER = LogManager.getLogger(Canasto.class);

    public void addProduct(Product newProduct) throws CarritoFullException {
        final int CAPACITY = 10;

        if (products.size() + 1 > CAPACITY) {
            throw new CarritoFullException("El carrito no puede agregar mas productos.");
        }
        if (products.size() + 1 == CAPACITY) {
            LOGGER.warn("Carrito lLeno.");
        }
        products.add(newProduct);
    }

    public void getProduct() throws CarritoVacioException {
        if (!(products.size() > 0)) {
            throw new CarritoVacioException("No hay productos en el canasto.");
        }
        //change for logger
        products.forEach(p -> System.out.println("Name: " + p.getNombre() + ", id: " +
                p.getProductId() + ", price: " + p.getPrecio()));
    }

    public Product getProduct(Integer id) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getProductId().equals(id)) {
                return product;
            }
        }
        throw new ProductNotFoundException("Producto no encontrado.");
    }

    public void removeProduct(Product product) throws ProductNotFoundException {
        if (!products.contains(product)) {
            throw new ProductNotFoundException("Producto no encontrado.");
        }
        products.remove(product);
    }
    public void removeProduct(String name) throws ProductNotFoundException {

        boolean containsProduct = false;

        for (Product p : products) {
            if (p.getNombre().equals(name)) {
                products.remove();
                containsProduct = true;
            }
        }
        if (!containsProduct) {
            throw new ProductNotFoundException("Producto no encontrado.");
        }
    }



}
