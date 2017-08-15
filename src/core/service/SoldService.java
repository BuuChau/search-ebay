package core.service;

import core.common.InitCommon;
import core.model.request.Sold;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by phuoclt on 8/15/17.
 */
public class SoldService {

    @FXML
    TextField tbSold;

    @FXML
    public void initialize() {
        if (InitCommon.sold != null && !InitCommon.sold.getValue().isEmpty())
            tbSold.setText(InitCommon.sold.getValue());

        tbSold.textProperty().addListener((observable, oldValue, newValue) -> InitCommon.sold = new Sold(newValue));
    }
}
