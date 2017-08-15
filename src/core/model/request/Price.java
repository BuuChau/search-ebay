package core.model.request;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/15/17.
 */
public class Price implements Serializable {

    Integer from = 0 ;
    Integer to = 100000000;

    public Integer getFrom() {
        return from;
    }

    public Integer getTo() {
        return to;
    }

    public Price() {

    }

    public Price(Integer from, Integer to) {

        this.from = from;
        this.to = to;
    }
}
