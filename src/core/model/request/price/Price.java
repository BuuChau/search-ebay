package core.model.request.price;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/16/17.
 */
public class Price implements Serializable {

    String from;
    String to;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Price(String from, String to) {

        this.from = from;
        this.to = to;
    }

    public Price() {

    }
}
