import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by ronny.ness on 10/08/15.
 */
public class Client extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

//        Button button = new Button("Click me");
//        button.setOnAction(event -> System.out.println("Button clicked!"));
//
//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//        primaryStage.setScene(new Scene(layout, 800, 600));
//        primaryStage.show();

        primaryStage.setTitle("Hello World");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add("style.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[]args) {
        launch(args);
    }
}
