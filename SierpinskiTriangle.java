// chapter1/HelloFX.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import java.awt.*;

// chapter1/FXModality.java
public class SierpinskiTriangle extends Application {

    @Override
    public void start(Stage primaryStage) {
        FractalPane pane = new FractalPane();

        TilePane root = new TilePane(5,5);
        root.setPrefColumns(4);
        root.setPrefRows(4);
        // compare to
        // FlowPane root = new FlowPane(5, 5);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int size = (int) (5 + 30 * Math.random());
                Color isColor = ((i + j) % 2 == 0) ? Color.RED : Color.BLUE;
                Rectangle rect = new Rectangle(size, size, isColor);
                root.getChildren().add(rect);
            }
        }

        Scene scene = new Scene(root, 200, 210);
        primaryStage.setTitle("SierpinskiTriangle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage;

    }
}