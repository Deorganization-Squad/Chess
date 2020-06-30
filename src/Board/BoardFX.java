package Board;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pieces.Piece;
import javafx.scene.image.Image ;
import java.io.FileInputStream;
import java.io.IOException;

public class BoardFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = FXMLLoader.load(getClass().getResource("BoardInfo.fxml"));
        primaryStage.setScene(new Scene(root, 603.0,730.0 ));
        primaryStage.setMaxHeight(750.0);
        primaryStage.setMaxWidth(620.0);
        primaryStage.setMinHeight(750.0);
        primaryStage.setMinWidth(620.0);
//        GridPane gridPane = new GridPane();
        Image image = new Image("File:Icons\\test.png");
        primaryStage.show();
        root.getChildren().indexOf(0);
        GridPane grid = (GridPane)root.getChildren().get(0);
        grid.add(new ImageView(image),0,0);

        //addAll(new ImageView(image));
        primaryStage.setTitle("Chess game");


//        Image blackPawn = new Image(new FileInputStream("File:Icons\\test.png"));
//        Scene scene = new Scene(gridPane);

//        primaryStage.setScene(scene);
    }
    //public Piece


}
