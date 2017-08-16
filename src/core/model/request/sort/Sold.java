package core.model.request.sort;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/16/17.
 */
public class Sold implements Serializable {

    String value;

    public String getValue() {
        return value;
    }

    public Sold() {

    }

    public Sold(String value) {

        this.value = value;
    }
}
