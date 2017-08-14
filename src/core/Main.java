package core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private BorderPane borderPane;

    @Override
    public void start(Stage primaryStage) throws IOException{
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Hello World");
        showMainView();
    }

    private void showMainView() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/search.fxml"));
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
