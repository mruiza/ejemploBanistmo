package questions;

import model.ConvertNominalEffectiveRateData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import java.util.List;

import static userinterface.FromNominalRateToEffectiveRatePage.*;

public class Verify implements Question<Boolean> {

    private final List<ConvertNominalEffectiveRateData> convertNominalEffectiveRateData;

    public Verify(List<ConvertNominalEffectiveRateData> convertNominalEffectiveRateData) {
        this.convertNominalEffectiveRateData = convertNominalEffectiveRateData;
    }

    public static Verify toThe(List<ConvertNominalEffectiveRateData> convertNominalEffectiveRateData) {
        return new Verify(convertNominalEffectiveRateData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean flag = false;

        String effectiveRate = Text.of(RESULT_LABEL).viewedBy(actor).asString();
        System.out.print(effectiveRate);
        System.out.print(convertNominalEffectiveRateData.get(0).getEffective_rate());
        if (convertNominalEffectiveRateData.get(0).getEffective_rate().equals(effectiveRate)) {
            flag = true;
        }
        return flag;
    }
 }



