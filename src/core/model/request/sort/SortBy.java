package core.model.request.sort;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/16/17.
 */
public class SortBy implements Serializable {

    String value;

    public String getValue() {
        return value;
    }

    public SortBy() {

    }

    public SortBy(String value) {

        this.value = value;
    }
}
