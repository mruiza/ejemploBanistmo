package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterface.InterestRateConverterPage;

import static userinterface.InterestRateConverterPage.*;

public class GoTo implements Task {

    public static GoTo theInterestRateConverter() {
        return Tasks.instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUSSINESS_BUTTON),
                Click.on(TOOLS_BUTTON),
                Scroll.to(INTEREST_RATE_CONVERTER_BUTTON),
                Click.on(INTEREST_RATE_CONVERTER_BUTTON)
                );
    }
}
