package core.common;

import core.model.request.category.Category;
import core.model.request.condition.Condition;
import core.model.request.datefilt.DateFilt;
import core.model.request.feedback.Feedback;
import core.model.request.format.BuyFormat;
import core.model.request.location.Location;
import core.model.request.price.Price;
import core.model.request.sort.ResultPage;
import core.model.request.sort.Sold;
import core.model.request.sort.SortBy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by phuoclt on 8/15/17.
 */
public class InitCommon {

    public static Category category = null;
    public static Price price = new Price();
    public static Set<BuyFormat> formats = new HashSet<>();
    public static Set<Condition> conditions = new HashSet<>();
    public static Set<Location> locations = new HashSet<>();
    public static SortBy sortBy = null;
    public static ResultPage resultPage = null;
    public static Sold sold = null;
    public static Feedback feedback = new Feedback();
    public static DateFilt dateFilt = null;
}
