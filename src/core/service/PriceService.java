package core.service;

import core.common.InitCommon;
import core.model.request.Price;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by phuoclt on 8/15/17.
 */
public class PriceService {

    @FXML
    TextField tbPriceFrom;
    @FXML
    TextField tbPriceTo;

    @FXML
    private void initialize(){
        if (InitCommon.price.getFrom() > 0)
            tbPriceFrom.setText(InitCommon.price.getFrom().toString());
        if (InitCommon.price.getTo() < 1000000000)
            tbPriceTo.setText(InitCommon.price.getTo().toString());

        tbPriceFrom.textProperty().addListener((observable, oldValue, newValue) -> InitCommon.price = new Price(Integer.parseInt(newValue),Integer.parseInt(tbPriceTo.getText())));

        tbPriceTo.textProperty().addListener((observable, oldValue, newValue) -> InitCommon.price = new Price(Integer.parseInt(tbPriceFrom.getText()),Integer.parseInt(newValue)));
    }
}
