package core.service;

import core.common.InitCommon;
import core.model.request.DateFilt;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
/**
 * Created by phuoclt on 8/15/17.
 */
public class DateFiltService {

    @FXML
    TextField tbDateFilt;

    @FXML
    public void initialize() {
        if (InitCommon.dateFilt != null && !InitCommon.dateFilt.getValue().isEmpty())
            tbDateFilt.setText(InitCommon.dateFilt.getValue());
        tbDateFilt.textProperty().addListener(new ChangeListener<String>(){

            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                InitCommon.dateFilt = new DateFilt(newValue);
            }
        });
    }
}
