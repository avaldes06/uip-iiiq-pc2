package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.*;

public class Controller {


    public void start(Stage stage) {
        Image image;
        image = new Image("CSS.jpg");
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        stage.show();
    }

    //Bloque donde ingresa la opcion de Iniciar Sesión y llegar a una segunda pantalla

    @FXML
    private Button b1;

    public void cambiar_pantalla(ActionEvent actionEvent) throws IOException {
        Stage stage;
        Parent root;
        stage = (Stage) b1.getScene().getWindow();
        root =FXMLLoader.load(getClass().getResource("Pantalla2.fxml"));
        Scene scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Parte en donde se le da opcion de Cambiar de una pantalla a otra

    @FXML
    private Button pa1;

    public void pantalla_anterior(ActionEvent actionEvent) throws IOException {
        Stage stage1;
        Parent root;
        stage1 = (Stage) pa1.getScene().getWindow();
        root =FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene =new Scene(root);
        stage1.setScene(scene);
        stage1.show();
    }

    // Parte en la cual se le da la opcion de salir en un comando al usuario

    @FXML
    private Button s1;

    public void salir(ActionEvent actionEvent) throws IOException {
        System.exit(0);
    }

    // Bloque en el cual se genera la opcion de seleccionar un tipo de examen en especifico para realizar

    @FXML
    private Button g1;
    public void exaglucosa(ActionEvent actionevent) throws IOException{
        String archivo1 = "Examen de Glucosa.html";
        FileWriter f1 = new FileWriter(archivo1);
        BufferedWriter b1 = new BufferedWriter(f1);
        b1.newLine();
        b1.write("              "+ "Caja de Seguro Social");
        b1.newLine();
        b1.newLine();
        b1.newLine();
        b1.newLine();
        b1.write("          "+" Laboratorio Médico");     //Caso que exporta informacion a través de un archivo HTML hacia Microsoft Word con un recetario de Laboratorio Médico
        b1.newLine();
        b1.newLine();
        b1.write("  Generación de Examen ");
        b1.newLine();
        b1.newLine();
        b1.write(" Nombre:");
        b1.newLine();
        b1.write(" Cédula:");
        b1.newLine();
        b1.write(" Edad:");
        b1.newLine();
        b1.write(" Sexo:");
        b1.newLine();
        b1.write(" Tipo de Sangre:");
        b1.newLine();
        b1.write(" Resultado de Glucosa: _________ "+"mg/dl");
        b1.newLine();
        b1.newLine();
        b1.flush();
        b1.write("           (VN 70-110 mg/dl)");
        b1.newLine();
        b1.newLine();
        b1.write("            Laboratorista: ______________________");
        b1.newLine();
        b1.write("                                   CSS");
        b1.flush();
        b1.newLine();
        b1.newLine();
    }

    @FXML
    private Button n1;
    public void exanitrourea(ActionEvent actionevent) throws IOException{
        String archivo1 = "Examen de Nitrogeno de Urea.html";
        FileWriter f1 = new FileWriter(archivo1);
        BufferedWriter b1 = new BufferedWriter(f1);
        b1.newLine();
        b1.write("              "+ "Caja de Seguro Social");
        b1.newLine();
        b1.newLine();
        b1.newLine();
        b1.newLine();
        b1.write("          "+" Laboratorio");
        b1.newLine();
        b1.newLine();
        b1.write("  Generación de Examen ");
        b1.newLine();
        b1.newLine();
        b1.write(" Nombre:");
        b1.newLine();
        b1.write(" Cédula:");
        b1.newLine();
        b1.write(" Edad:");
        b1.newLine();
        b1.write(" Sexo:");
        b1.newLine();
        b1.write(" Tipo de Sangre:");
        b1.newLine();
        b1.write(" Resultado de Nitrogeno de Urea: _________ "+"mg/dl");
        b1.newLine();
        b1.newLine();
        b1.flush();
        b1.write("           (VN 4.3-23.4 mg/dl)");
        b1.newLine();
        b1.newLine();
        b1.write("            Laboratorista: ______________________");
        b1.newLine();
        b1.write("                                   CSS");
        b1.flush();
        b1.newLine();
        b1.newLine();
    }

    @FXML
    private Button t1;
    public void exatrigli (ActionEvent actionevent) throws IOException{
        String archivo1 = "Examen de Triglicerido.html";
        FileWriter f1 = new FileWriter(archivo1);
        BufferedWriter b1 = new BufferedWriter(f1);
        b1.newLine();
        b1.write("              "+ "Caja de Seguro Social");
        b1.newLine();
        b1.newLine();
        b1.newLine();
        b1.newLine();
        b1.write("          "+" Laboratorio");
        b1.newLine();
        b1.newLine();
        b1.write("  Generación de Examen ");
        b1.newLine();
        b1.newLine();
        b1.write(" Nombre:");
        b1.newLine();
        b1.write(" Cédula:");
        b1.newLine();
        b1.write(" Edad:");
        b1.newLine();
        b1.write(" Sexo:");
        b1.newLine();
        b1.write(" Tipo de Sangre:");
        b1.newLine();
        b1.write(" Resultado de Trigliceridos: _________ "+"mg/dl");
        b1.newLine();
        b1.newLine();
        b1.flush();
        b1.write("           (VN 2.0 - 6.0 mg/dl)");
        b1.newLine();
        b1.newLine();
        b1.write("            Laboratorista: ______________________");
        b1.newLine();
        b1.write("                                   CSS");
        b1.flush();
        b1.newLine();
        b1.newLine();
    }

    @FXML
    private Button c1;
    public void exacole (ActionEvent actionevent) throws IOException{
        String archivo1 = "Examen de Colesterol.html";
        FileWriter f1 = new FileWriter(archivo1);
        BufferedWriter b1 = new BufferedWriter(f1);
        b1.newLine();
        b1.write("              "+ "Caja de Seguro Social");
        b1.newLine();
        b1.newLine();
        b1.newLine();
        b1.newLine();
        b1.write("          "+" Laboratorio");
        b1.newLine();
        b1.newLine();
        b1.write("  Generación de Examen ");
        b1.newLine();
        b1.newLine();
        b1.write(" Nombre:");
        b1.newLine();
        b1.write(" Cédula:");
        b1.newLine();
        b1.write(" Edad:");
        b1.newLine();
        b1.write(" Sexo:");
        b1.newLine();
        b1.write(" Tipo de Sangre:");
        b1.newLine();
        b1.write(" Resultado de Colesterol: _________ "+"mg/dl");
        b1.newLine();
        b1.newLine();
        b1.flush();
        b1.write("           (VN Hasta 250 mg/dl)");
        b1.newLine();
        b1.newLine();
        b1.write("            Laboratorista: ______________________");
        b1.newLine();
        b1.write("                                   CSS");
        b1.flush();
        b1.newLine();
        b1.newLine();
    }

    @FXML
    private Button cr1;
    public void exacrea (ActionEvent actionevent) throws IOException{
        String archivo1 = "Examen de Creatinina.html";
        FileWriter f1 = new FileWriter(archivo1);
        BufferedWriter b1 = new BufferedWriter(f1);
        b1.newLine();
        b1.write("              "+ "Caja de Seguro Social");
        b1.newLine();
        b1.newLine();
        b1.newLine();
        b1.newLine();
        b1.write("          "+" Laboratorio");
        b1.newLine();
        b1.newLine();
        b1.write("  Generación de Examen ");
        b1.newLine();
        b1.newLine();
        b1.write(" Nombre:");
        b1.newLine();
        b1.write(" Cédula:");
        b1.newLine();
        b1.write(" Edad:");
        b1.newLine();
        b1.write(" Sexo:");
        b1.newLine();
        b1.write(" Tipo de Sangre:");
        b1.newLine();
        b1.write(" Resultado de Creatinina: _________ "+"mg/dl");
        b1.newLine();
        b1.newLine();
        b1.flush();
        b1.write("           (VN 0.4 - 1.4 mg/dl)");
        b1.newLine();
        b1.newLine();
        b1.write("            Laboratorista: ______________________");
        b1.newLine();
        b1.write("                                   CSS");
        b1.flush();
        b1.newLine();
        b1.newLine();
    }



}