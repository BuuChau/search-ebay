package core.service;

import core.common.InitCommon;
import core.model.request.Location;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

/**
 * Created by phuoclt on 8/15/17.
 */
public class LocationService {

    @FXML
    CheckBox cbAllLocation;
    @FXML
    CheckBox cbUSOnly;
    @FXML
    CheckBox cbNorthAmerica;
    @FXML
    CheckBox cbEurope;
    @FXML
    CheckBox cbAsia;

    @FXML
    private void initialize() {
        if (InitCommon.locations != null && InitCommon.locations.size() > 0){
            for (Location location : InitCommon.locations){
                if (location.getKey().equals(cbAllLocation.getId()))
                    cbAllLocation.setSelected(true);
                else if (location.getKey().equals(cbUSOnly.getId()))
                    cbUSOnly.setSelected(true);
                else if (location.getKey().equals(cbNorthAmerica.getId()))
                    cbNorthAmerica.setSelected(true);
                else if (location.getKey().equals(cbEurope.getId()))
                    cbEurope.setSelected(true);
                else if (location.getKey().equals(cbAsia.getId()))
                    cbAsia.setSelected(true);
            }
        }
    }

    @FXML
    private void cbAllChecked(ActionEvent event){
        configureCheckBox(cbAllLocation);
    }

    @FXML
    private void cbUSOnlyChecked(ActionEvent event){
        configureCheckBox(cbUSOnly);
    }

    @FXML
    private void cbNorthAmericaChecked(ActionEvent event){
        configureCheckBox(cbNorthAmerica);
    }

    @FXML
    private void cbEuropeChecked(ActionEvent event){
        configureCheckBox(cbEurope);
    }

    @FXML
    private void cbAsiaChecked(ActionEvent event){
        configureCheckBox(cbAsia);
    }

    private void configureCheckBox(CheckBox checkBox) {

        if (checkBox.isSelected()) {
            InitCommon.locations.add(new Location(checkBox.getId(),checkBox.getText()));
        } else {
            InitCommon.locations.remove(new Location(checkBox.getId(),checkBox.getText()));
        }
    }
}
