package core.model.request.location;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/16/17.
 */
public class Location implements Serializable {

    String key;
    String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Location(String key, String value) {

        this.key = key;
        this.value = value;
    }

    public Location() {

    }
}
