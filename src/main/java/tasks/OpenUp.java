package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.BancolombiaGroupPage;

public class OpenUp implements Task {

    private BancolombiaGroupPage bancolombiaGroupPage;

    public static OpenUp thePageBancolombia() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(bancolombiaGroupPage));
    }
}
