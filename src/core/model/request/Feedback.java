package core.model.request;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/15/17.
 */
public class Feedback implements Serializable {

    Integer from = 0;
    Integer to = 1000000000;

    public Feedback() {
    }

    public Integer getFrom() {

        return from;
    }

    public Integer getTo() {
        return to;
    }

    public Feedback(Integer from, Integer to) {

        this.from = from;
        this.to = to;
    }
}
