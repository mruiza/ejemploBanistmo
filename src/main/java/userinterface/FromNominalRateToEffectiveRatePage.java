package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FromNominalRateToEffectiveRatePage extends PageObject {
    public static final Target NOMINAL_RATE_TO_EFFECTIVE_RATE_BUTTON = Target.the("button that shows us the converter").
            located(By.id("btntoolUno"));
    public static final Target INTEREST_RATE_TEXT = Target.the("TextBox where we write the interest rate").
            located(By.id("interes"));
    public static final Target PERIODICITY_LISTA = Target.the("List where select the periodicity").
            located(By.id("periodicidad-deseada"));
    public static final Target CAPITALIZATION_LISTA = Target.the("List where select the capitalization").
            located(By.id("capitalizacion"));
    public static final Target RESULT_LABEL = Target.the("Label where shows the Effective Rate").
            located(By.id("respuesta"));
}