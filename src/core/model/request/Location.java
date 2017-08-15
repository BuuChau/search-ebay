package core.model.request;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/15/17.
 */
public class Location implements Serializable {

    String key;
    String value;

    public String getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    public Location() {

    }

    public Location(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
