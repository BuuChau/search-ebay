package core;

import core.common.InitCommon;
import core.model.request.category.Category;
import core.model.request.condition.Condition;
import core.model.request.datefilt.DateFilt;
import core.model.request.feedback.Feedback;
import core.model.request.format.BuyFormat;
import core.model.request.price.Price;
import core.model.request.sort.ResultPage;
import core.model.request.sort.Sold;
import core.model.request.sort.SortBy;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class SearchController {



    @FXML
    public void initialize() {
        setCategory();
        setPrice();
        setBuyFormat();
        setCondition();
        //setLocation();
        setSortBy();
        setResultPerPage();
        setSold();
        setFeedback();
        setDateFilt();
    }

    /**
     * Category
     */
    @FXML
    ComboBox cbbCategory;

    private void setCategory(){
        if (InitCommon.category == null){
            cbbCategory.getSelectionModel().selectFirst();
            InitCommon.category = new Category(cbbCategory.getValue().toString());
        }
    }

    /**
     * Price
     */
    @FXML
    TextField tfPriceFrom;
    @FXML
    TextField tfPriceTo;

    private void setPrice(){
        if (InitCommon.price.getFrom() != null)
            tfPriceFrom.setText(InitCommon.price.getFrom().toString());
        if (InitCommon.price.getTo() != null)
            tfPriceTo.setText(InitCommon.price.getTo().toString());

        tfPriceFrom.textProperty().addListener((observable, oldValue, newValue) -> InitCommon.price = new Price(newValue,tfPriceTo.getText()));

        tfPriceTo.textProperty().addListener((observable, oldValue, newValue) -> InitCommon.price = new Price(tfPriceFrom.getText(),newValue));
    }

    /**
     * Fotmat
     */
    @FXML
    CheckBox cbAuction;
    @FXML
    CheckBox cbBuyItNow;

    private void setBuyFormat(){
        if (InitCommon.formats.size() > 0){
            for (BuyFormat condition : InitCommon.formats) {
                if (condition.getKey().equals(cbAuction.getId()))
                    cbAuction.setSelected(true);
                else if (condition.getKey().equals(cbBuyItNow.getId()))
                    cbBuyItNow.setSelected(true);
            }
        }
    }

    @FXML
    private void cbAuctionChecked(ActionEvent event){
        configureCheckBoxFormat(cbAuction);
    }

    @FXML
    private void cbBuyItNowChecked(ActionEvent event){
        configureCheckBoxFormat(cbBuyItNow);
    }

    private void configureCheckBoxFormat(CheckBox checkBox) {

        if (checkBox.isSelected()) {
            InitCommon.formats.add(new BuyFormat(checkBox.getId(),checkBox.getText()));
        } else {
            InitCommon.formats.remove(new BuyFormat(checkBox.getId(),checkBox.getText()));
        }
    }

    /**
     * Condition
     */
    @FXML
    CheckBox cbNew;
    @FXML
    CheckBox cbUser;
    @FXML
    CheckBox cbNotSpecified;

    public void setCondition() {
        if (InitCommon.conditions.size() > 0){
            for (Condition condition : InitCommon.conditions) {
                if (condition.getKey().equals(cbNew.getId()))
                    cbNew.setSelected(true);
                else if (condition.getKey().equals(cbUser.getId()))
                    cbUser.setSelected(true);
                else if (condition.getKey().equals(cbNotSpecified.getId()))
                    cbNotSpecified.setSelected(true);
            }
        }
    }

    @FXML
    private void cbNewChecked(ActionEvent event){
        configureCheckBoxCondition(cbNew);
    }

    @FXML
    private void cbUserChecked(ActionEvent event){
        configureCheckBoxCondition(cbUser);
    }

    @FXML
    private void cbNotSpecifiedChecked(ActionEvent event){
        configureCheckBoxCondition(cbNotSpecified);
    }

    private void configureCheckBoxCondition(CheckBox checkBox) {

        if (checkBox.isSelected()) {
            InitCommon.conditions.add(new Condition(checkBox.getId(),checkBox.getText()));
        } else {
            InitCommon.conditions.remove(new Condition(checkBox.getId(),checkBox.getText()));
        }
    }

    /**
     * Location
     */


    /**
     * Sort by
     */
    @FXML
    ComboBox cbbSortBy;

    private void setSortBy(){
        if (InitCommon.sortBy == null){
            cbbCategory.getSelectionModel().selectFirst();
            InitCommon.sortBy = new SortBy(cbbSortBy.getValue().toString());
        }
    }
    /**
     * Result Per Page
     */
    @FXML
    ComboBox cbbResultPerPage;

    private void setResultPerPage(){
        if (InitCommon.resultPage == null){
            cbbResultPerPage.getSelectionModel().selectFirst();
            InitCommon.resultPage = new ResultPage(cbbResultPerPage.getValue().toString());
        }
    }

    /**
     * Sold
     */
    @FXML
    TextField tfSold;

    private void setSold(){
        if (!InitCommon.sold.getValue().isEmpty())
            tfSold.setText(InitCommon.sold.getValue().toString());

        tfSold.textProperty().addListener((observable, oldValue, newValue) -> InitCommon.sold = new Sold(newValue));
    }

    /**
     * Feedbank
     */
    @FXML
    TextField tfFeedbackFrom;
    @FXML
    TextField tfFeedbackTo;

    private void setFeedback(){
        if (!InitCommon.feedback.getFrom().isEmpty())
            tfFeedbackFrom.setText(InitCommon.feedback.getFrom().toString());
        if (!InitCommon.feedback.getTo().isEmpty())
            tfFeedbackTo.setText(InitCommon.feedback.getTo().toString());

        tfFeedbackFrom.textProperty().addListener((observable, oldValue, newValue) -> InitCommon.feedback = new Feedback(newValue,tfPriceTo.getText()));
        tfFeedbackTo.textProperty().addListener((observable, oldValue, newValue) -> InitCommon.feedback = new Feedback(tfPriceFrom.getText(),newValue));
    }

    /**
     * Date filt
     */
    @FXML
    TextField tfDateFilt;

    private void setDateFilt(){
        if (!InitCommon.dateFilt.getValue().isEmpty())
            tfDateFilt.setText(InitCommon.dateFilt.getValue().toString());

        tfDateFilt.textProperty().addListener((observable, oldValue, newValue) -> InitCommon.dateFilt = new DateFilt(newValue));
    }
}
