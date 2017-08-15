package core.common;

import core.model.request.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by phuoclt on 8/15/17.
 */
public class InitCommon {

    public static Set<Condition> conditions = new HashSet<>();
    public static DateFilt dateFilt = null;
    public static Feedback feedback = new Feedback();
    public static Set<Location> locations = new HashSet<>();
    public static Price price = new Price();
    public static Sold sold = null;
}
