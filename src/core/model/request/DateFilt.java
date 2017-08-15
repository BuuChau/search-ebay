package core.model.request;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/15/17.
 */
public class DateFilt implements Serializable {

    String value;

    public String getValue() {
        return value;
    }

    public DateFilt() {

    }

    public DateFilt(String value) {

        this.value = value;
    }
}
