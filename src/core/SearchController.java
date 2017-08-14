package core;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class SearchController {

    @FXML
    Pane pane;

    @FXML
    private void btConditionClicked(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("../view/condition/condition.fxml"));
        pane.getChildren().add(newLoadedPane);
    }

    @FXML
    private void btPriceClicked(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("../view/condition/price.fxml"));
        pane.getChildren().add(newLoadedPane);
    }

    @FXML
    private void btLocationClicked(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("../view/condition/location.fxml"));
        pane.getChildren().add(newLoadedPane);
    }

    @FXML
    private void btFeedBackClicked(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("../view/condition/feedback.fxml"));
        pane.getChildren().add(newLoadedPane);
    }

    @FXML
    private void btSoldClicked(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("../view/condition/sold.fxml"));
        pane.getChildren().add(newLoadedPane);
    }

    @FXML
    private void btDateFiltClicked(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("../view/condition/datefilt.fxml"));
        pane.getChildren().add(newLoadedPane);
    }


}
