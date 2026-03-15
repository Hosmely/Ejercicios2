import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    @FXML
    private TableView<Producto> tabla;
    @FXML
    private TableColumn<Producto, String> colNombre; 
    @FXML
    private TableColumn<Producto, Double> colPrecio; 
    @FXML
    private TableColumn<Producto, Integer> colCantidad; 

    @FXML
    private TextField txtNombre; 
    @FXML
    private TextField txtPrecio; 
    @FXML
    private TextField txtCantidad; 

    @FXML
    private Button btnAgregar; 
    @FXML
    private Button btnEliminar; 

    // Lista observable para los productos
    private ObservableList<Producto> listaProductos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        

        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        colCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));

        tabla.setItems(listaProductos);

        btnAgregar.setOnAction(e -> agregar());

        btnEliminar.setOnAction(e -> {
            Producto seleccionado = tabla.getSelectionModel().getSelectedItem();
            listaProductos.remove(seleccionado);
        });

        colPrecio.setCellFactory(col -> new TableCell<>() {
            @Override
            protected void updateItem(Double valor, boolean empty) {
                super.updateItem(valor, empty);
                setText(empty || valor == null ? null : String.format("%.2f", valor));
            }
        });
    }

    public void agregar() {
        String nombre = txtNombre.getText().trim();

        try {
            double precio = Double.parseDouble(txtPrecio.getText().trim());
            int cantidad = Integer.parseInt(txtCantidad.getText().trim());
            Producto nuevoProducto = new Producto(nombre, precio, cantidad);
            listaProductos.add(nuevoProducto); 
            

            // Limpiar los campos de texto después de agregar el producto
            txtNombre.clear();
            txtPrecio.clear();
            txtCantidad.clear();

        } catch (NumberFormatException ex) {

        }
    }
}