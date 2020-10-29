
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class MyApp9 extends Application{
    @Override
    public void start(Stage window){
        GridPane root= new GridPane();
        root.setMinSize(200,100);
        root.setPadding(new Insets(15,15,15,15));
        root.setVgap(20);
        root.setHgap(20);
        root.setAlignment(Pos.CENTER);
        Text textnama = new Text("Nama");
        TextField tfnama = new TextField();
        Text texttelephone = new Text("Telephone");
        TextField tftelephone = new TextField();
        Text textalamat = new Text("Alamat");
        TextArea tfalamat = new TextArea();
        TilePane tpane = new TilePane();
        Button btkirim = new Button("Kirim");
        Button bthapus = new Button("Hapus");
        tpane.setOrientation(Orientation.HORIZONTAL);
        tpane.setAlignment(Pos.CENTER);
        tpane.getChildren().addAll(btkirim,bthapus);
        root.add(textnama,0,0);
        root.add(tfnama,1,0);
        root.add(texttelephone,0,1);
        root.add(tftelephone,1,1);
        root.add(textalamat,0,2);
        root.add(tfalamat,1,2);
        root.add(tpane,1,3);
        window.setTitle("event");
        Scene scenedasar = new Scene(root);
        window.setScene(scenedasar);
        window.show();
        
    }
    public static void main (String arsg[]){
        launch(arsg);
    }
}
