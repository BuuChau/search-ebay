package core.model.request.category;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/16/17.
 */
public class Category implements Serializable {

    String value;


    public String getValue() {
        return value;
    }

    public Category() {

    }

    public Category(String value) {

        this.value = value;
    }
}
