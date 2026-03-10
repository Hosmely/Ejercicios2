import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    private List<Personaje> personajes = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();

        stage.setTitle("Registro");
        // Group root = new Group();
        Label titulo = new Label("Registro de personajes de Dragon ball z\n");
        titulo.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(titulo, grid);
        Text text2 = new Text(30, 30, "Nombre:");
        Text text3 = new Text(30, 30, "Raza:");
        Text text4 = new Text(30, 30, "Poder:");
        Text text5 = new Text(30, 30, "Planeta:");
        Text text6 = new Text(30, 30, "Tecnica:");
        Text text7 = new Text(30, 30, "Edad:");

        grid.setHgap(10); 
        grid.setVgap(10);

        // root.getChildren().add(grid);

        grid.add(text2, 0, 1);
        grid.add(text3, 0, 2);
        grid.add(text4, 0, 3);
        grid.add(text5, 0, 4);
        grid.add(text6, 0, 5);
        grid.add(text7, 0, 6);

        TextField c1 = new TextField();
        TextField c2 = new TextField();
        TextField c3 = new TextField();
        TextField c4 = new TextField();
        TextField c5 = new TextField();
        TextField c6 = new TextField();
        grid.add(c1, 1, 1);
        grid.add(c2, 1, 2);
        grid.add(c3, 1, 3);
        grid.add(c4, 1, 4);
        grid.add(c5, 1, 5);
        grid.add(c6, 1, 6);

        Scene scene = new Scene(vbox);
        Button bton1 = new Button("Agregar");
        bton1.setOnAction(e -> {
            AgregarPersonaje(c1.getText(), c2.getText(), Integer.parseInt(c3.getText()), c4.getText(), c5.getText(),
                    Integer.parseInt(c6.getText()));
            grid.getChildren().clear();
            c1.clear();
            c2.clear();
            c3.clear();
            c4.clear();
            c5.clear();
            c6.clear();

            text2.setText("Nombre");
            text3.setText("Raza");
            text4.setText("Poder");
            text5.setText("Planeta");
            text6.setText("Tecnica");
            text7.setText("Edad");

            grid.add(text2, 0, 1);
            grid.add(text3, 1, 0);
            grid.add(text4, 2, 0);
            grid.add(text5, 3, 0);
            grid.add(text6, 4, 0);
            grid.add(text7, 5, 0);
            grid.getChildren().removeIf(node -> GridPane.getRowIndex(node) > 1);

            
            for (int i = 0; i < personajes.size(); i++) {
                Personaje p = personajes.get(i);

                
                grid.add(new Text(p.getNombre()), 1, i + 2); 
                grid.add(new Text(p.getRaza()), 2, i + 2); 
                grid.add(new Text(String.valueOf(p.getNivelPoder())), 3, i + 2); 
                grid.add(new Text(p.getPlanetaOrigen()), 4, i + 2); 
                grid.add(new Text(p.getTecnicaEspecial()), 5, i + 2); 
                grid.add(new Text(String.valueOf(p.getEdad())), 6, i + 2); 

            }
        });

        grid.add(bton1, 0, 10);
        stage.setScene(scene);

        stage.show();
    }

    public void AgregarPersonaje(String nombre, String raza, int nivelPoder, String planeta, String tecnica, int edad) {
        personajes.add(new Personaje(nombre, raza, nivelPoder, planeta, tecnica, edad));

    }

}
