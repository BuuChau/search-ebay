package core.service;

import core.common.InitCommon;
import core.model.request.Condition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by phuoclt on 8/15/17.
 */
public class ConditionService {

    @FXML
    CheckBox cbNew;
    @FXML
    CheckBox cbUser;
    @FXML
    CheckBox cbNotSpecified;

    @FXML
    public void initialize() {
        if (InitCommon.conditions.size() > 0){
            for (Condition condition : InitCommon.conditions) {
                if (condition.getValue().equals(cbNew.getText()))
                    cbNew.setSelected(true);
                else if (condition.getValue().equals(cbUser.getText()))
                    cbUser.setSelected(true);
                else if (condition.getValue().equals(cbNotSpecified.getText()))
                    cbNotSpecified.setSelected(true);
            }
        }
    }

    @FXML
    private void cbNewChecked(ActionEvent event){
        configureCheckBox(cbNew);
    }

    @FXML
    private void cbUserChecked(ActionEvent event){
        configureCheckBox(cbUser);
    }

    @FXML
    private void cbNotSpecifiedChecked(ActionEvent event){
        configureCheckBox(cbNotSpecified);
    }

    private void configureCheckBox(CheckBox checkBox) {

        if (checkBox.isSelected()) {
            InitCommon.conditions.add(new Condition(checkBox.getText()));
        } else {
            InitCommon.conditions.remove(new Condition(checkBox.getText()));
        }
    }

}
