
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 */
public class Main extends Application {

    @Override
    public void start(Stage primarystage) throws Exception {
        try{
        Parent parentroot = FXMLLoader.load(getClass().getResource("Penshoppe Dashboard.fxml"));
        Scene scene = new Scene(parentroot,400,400);
        scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        primarystage.setTitle("Ulang Penshoppe");
        primarystage.setScene(scene);
        primarystage.show();
        
        
        }catch(Exception ex){
        
        
        }
    }public static void main(String[]args){
        launch(args);
    }
    
    
    
}
