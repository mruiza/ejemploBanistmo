package model;

public class ConvertNominalEffectiveRateData {
    private String rate_interest;
    private String periodicity;
    private String capitalization;

    public String getRate_interest() {
        return rate_interest;
    }

    public void setRate_interest(String rate_interest) {
        this.rate_interest = rate_interest;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getCapitalization() {
        return capitalization;
    }

    public void setCapitalization(String capitalization) {
        this.capitalization = capitalization;
    }

    public String getEffective_rate() {
        return effective_rate;
    }

    public void setEffective_rate(String effective_rate) {
        this.effective_rate = effective_rate;
    }

    private String effective_rate;
}
