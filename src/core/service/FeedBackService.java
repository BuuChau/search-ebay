package core.service;

import core.common.InitCommon;
import core.model.request.Feedback;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by phuoclt on 8/15/17.
 */
public class FeedBackService {

    @FXML
    TextField tbFeedbackFrom;
    @FXML
    TextField tbFeedbackTo;

    Integer from;
    Integer to;

    @FXML
    private void initialize(){
        if (InitCommon.feedback.getFrom() > 0)
            tbFeedbackFrom.setText(InitCommon.feedback.getFrom().toString());
        if (InitCommon.feedback.getTo() < 1000000000)
            tbFeedbackTo.setText(InitCommon.feedback.getTo().toString());

        tbFeedbackFrom.textProperty().addListener((observable, oldValue, newValue) -> InitCommon.feedback = new Feedback(Integer.parseInt(newValue),Integer.parseInt(tbFeedbackTo.getText())));

        tbFeedbackTo.textProperty().addListener((observable, oldValue, newValue) -> InitCommon.feedback = new Feedback(Integer.parseInt(tbFeedbackFrom.getText()),Integer.parseInt(newValue)));
    }
}
