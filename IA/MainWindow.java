import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainWindow extends Application{
    Button cat; //creates button find object
    //Button dog; //creates add object
  public static void main(String[] args){
    launch(args);
  }
    @Override
    public void start(Stage primaryStage) throws Exception{
      primaryStage.setTitle("Cookbook");

      cat = new Button();
      cat.setText("Find recipes");

      StackPane layout = new StackPane();
      layout.getChildren().add(cat);

    //  dog = new Button();
      //dog.setText("Add recipes");
    //  StackPane layout = new StackPane();
    //  layout.getChildren().add(button);

      Scene scene = new Scene(layout, 300, 300);
      primaryStage.setScene(scene);
      primaryStage.show();
    }
}
