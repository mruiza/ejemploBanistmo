package interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Select implements Interaction {

    private Target list;
    private String option;

    public Select(Target list, String option) {
        this.list = list;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElement> listObject = (List<WebElement>) list.resolveFor(actor).findElements(By.tagName("option"));
        System.out.print(listObject);
        for (int i = 0; i<listObject.size(); i++){
            if(listObject.get(i).getText().equals(option.trim())){
                listObject.get(i).click();
            }
        }
    }
    public static Select theOption(Target list, String option) {
        return new Select(list, option);
    }
}
