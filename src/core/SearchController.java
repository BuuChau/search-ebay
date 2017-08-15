package core;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class SearchController {

    @FXML
    ScrollPane scrollPane;
    @FXML
    Pane pnKeyword;
    @FXML
    Pane pnSearchIncluding;
    @FXML
    Pane pnPrice;
    @FXML
    Pane pnBuyFormat;
    @FXML
    Pane pnCondition;
    @FXML
    Pane pnShowResult;
    @FXML
    Pane pnLocation;
    @FXML
    Pane pnSortBy;
    @FXML
    Pane pnSold;
    @FXML
    Pane pnFeedback;
    @FXML
    Pane pnDateFilt;

    @FXML
    VBox Left;

    @FXML
    private void initialize() throws IOException {
        Pane newLoadedPane;
        newLoadedPane=  FXMLLoader.load(getClass().getResource("../view/condition/keywords.fxml"));
        pnKeyword.getChildren().add(newLoadedPane);
        //Left.getChildren().add(pnKeyword);

        newLoadedPane=  FXMLLoader.load(getClass().getResource("../view/condition/search_including.fxml"));
        pnSearchIncluding.getChildren().add(newLoadedPane);
        //Left.getChildren().addAll(pnSearchIncluding);

        newLoadedPane=  FXMLLoader.load(getClass().getResource("../view/condition/price.fxml"));
        pnPrice.getChildren().add(newLoadedPane);
        //Left.getChildren().addAll(pnPrice);

        newLoadedPane=  FXMLLoader.load(getClass().getResource("../view/condition/buying_formats.fxml"));
        pnBuyFormat.getChildren().add(newLoadedPane);
        //Left.getChildren().addAll(pnBuyFormat);

        newLoadedPane=  FXMLLoader.load(getClass().getResource("../view/condition/condition.fxml"));
        pnCondition.getChildren().add(newLoadedPane);
        //Left.getChildren().addAll(pnCondition);

        newLoadedPane=  FXMLLoader.load(getClass().getResource("../view/condition/show_results.fxml"));
        pnShowResult.getChildren().add(newLoadedPane);
        //Left.getChildren().addAll(pnShowResult);

        newLoadedPane=  FXMLLoader.load(getClass().getResource("../view/condition/location.fxml"));
        pnLocation.getChildren().add(newLoadedPane);
        //Left.getChildren().addAll(pnLocation);

        newLoadedPane=  FXMLLoader.load(getClass().getResource("../view/condition/sort_by.fxml"));
        pnSortBy.getChildren().add(newLoadedPane);
        //Left.getChildren().addAll(pnSortBy);

        newLoadedPane=  FXMLLoader.load(getClass().getResource("../view/condition/sold.fxml"));
        pnSold.getChildren().add(newLoadedPane);
        //Left.getChildren().addAll(pnSold);

        newLoadedPane=  FXMLLoader.load(getClass().getResource("../view/condition/feedback.fxml"));
        pnFeedback.getChildren().add(newLoadedPane);
        //Left.getChildren().addAll(pnFeedback);

        newLoadedPane=  FXMLLoader.load(getClass().getResource("../view/condition/datefilt.fxml"));
        pnDateFilt.getChildren().add(newLoadedPane);
        Left.getChildren().addAll(pnKeyword,pnSearchIncluding,pnPrice,pnBuyFormat,pnCondition,pnShowResult,pnLocation,pnSortBy,pnSold,pnFeedback,pnDateFilt);

        scrollPane.setContent(Left);
        scrollPane.setFitToHeight(true);
    }

    @FXML
    private void btReset(ActionEvent event) throws IOException {
        initialize();
    }
}
