package core.model.request;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/15/17.
 */
public class Condition implements Serializable {

    String value;

    public String getValue() {
        return value;
    }

    public Condition() {

    }

    public Condition(String value) {

        this.value = value;
    }
}
