package core.model.request.price;

import java.io.Serializable;

/**
 * Created by phuoclt on 8/16/17.
 */
public class Price implements Serializable {
    String typeMoney;
    String from;
    String to;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getTypeMoney() {
        return typeMoney;
    }

    public Price(String typeMoney, String from, String to) {
        this.typeMoney = typeMoney;
        this.from = from;
        this.to = to;
    }

    public void setTypeMoney(String typeMoney) {
        this.typeMoney = typeMoney;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Price() {

    }
}
