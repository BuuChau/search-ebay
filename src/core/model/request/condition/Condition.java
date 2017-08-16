package core.model.request.condition;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/16/17.
 */
public class Condition implements Serializable {

    String key;
    String value;

    public Condition() {
    }

    public String getKey() {

        return key;
    }

    public String getValue() {
        return value;
    }

    public Condition(String key, String value) {

        this.key = key;
        this.value = value;
    }
}
