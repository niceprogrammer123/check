import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Check extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
//      Pane pane = new Pane();
      HBox hBox = new HBox(20);
      hBox.setPadding(new Insets(45, 80, 45, 80));
      
      Text text1 = new Text("Java");
      text1.setRotate(90);
      hBox.getChildren().add(text1);
      Text text2 = new Text("Java");
      text2.setRotate(90);
      hBox.getChildren().add(text2);
      Text text3 = new Text("Java");
      text3.setRotate(90);
      hBox.getChildren().add(text3);
      Text text4 = new Text("Java");
      text4.setRotate(90);
      hBox.getChildren().add(text4);
      
      Scene scene = new Scene(hBox);
      primaryStage.setTitle("Show Text");
      primaryStage.setScene(scene);
      primaryStage.show();
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
