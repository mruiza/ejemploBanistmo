package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.ConvertNominalEffectiveRateData;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Verify;
import tasks.Convert;
import tasks.GoTo;
import tasks.OpenUp;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class InterestRateConverterStepDefinition {

    @Before
    public void prepareStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^that the user uses the interest rate convert page$")
    public void thatTheUserUsesTheInterestRateConvertPage() throws Exception {
        theActorCalled("User").wasAbleTo(OpenUp.thePageBancolombia(),
                GoTo.theInterestRateConverter());
    }

    @When("^He wants to convert from nominal to effective rate$")
    public void heWantsToConvertFromNominalToEffectiveRate(List<ConvertNominalEffectiveRateData> convertNominalEffectiveRateData) throws Exception {
        theActorInTheSpotlight().attemptsTo(Convert.fromNominalToEffectiveRate(convertNominalEffectiveRateData));
    }

    @Then("^He should see the result of conversion from rate nominal to effective rate$")
    public void heShouldSeeTheResultOfConversionFromRateNominalToEffectiveRate(List<ConvertNominalEffectiveRateData> convertNominalEffectiveRateData) throws Exception {
        theActorInTheSpotlight().should(seeThat(Verify.toThe(convertNominalEffectiveRateData)));
    }
}