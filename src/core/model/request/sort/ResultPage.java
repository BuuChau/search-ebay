package core.model.request.sort;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/16/17.
 */
public class ResultPage implements Serializable {

    String value;

    public ResultPage() {
    }

    public String getValue() {

        return value;
    }

    public ResultPage(String value) {

        this.value = value;
    }
}
