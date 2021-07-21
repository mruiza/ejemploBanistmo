package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterestRateConverterPage extends PageObject {
    public static final Target BUSSINESS_BUTTON = Target.the("button that shows us the Bussinness Options").
            located(By.id("header-pymes"));
    public static final Target TOOLS_BUTTON = Target.the("button that shows us the Tools Options").
            located(By.xpath("//section[@id='menu-top']//a[text()='Herramientas']"));
    public static final Target INTEREST_RATE_CONVERTER_BUTTON = Target.the("button that shows us the interest rate converter").
            located(By.xpath("//a[contains(@href,'/conversor-tasas/')]"));
}
