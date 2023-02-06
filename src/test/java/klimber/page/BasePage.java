package klimber.page;

import com.sun.istack.internal.logging.Logger;
import klimber.PageObjects.KlimberAssurancePageObjects;

public class BasePage extends WebDriverHelper{
    /******** Log Attribute ********/
    private static Logger log = Logger.getLogger(BasePage.class);
    KlimberAssurancePageObjects bookingSearchPageObjects = new KlimberAssurancePageObjects();
    private static final int EXPLICIT_TIMEOUT = 20;



}
