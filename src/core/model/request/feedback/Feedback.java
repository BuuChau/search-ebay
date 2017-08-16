package core.model.request.feedback;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/16/17.
 */
public class Feedback implements Serializable {

    String from;
    String to;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Feedback() {

    }

    public Feedback(String from, String to) {

        this.from = from;
        this.to = to;
    }
}
