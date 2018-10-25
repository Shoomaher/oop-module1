public class VoluntaryMedicalInsurancePolicy extends MedicalInsurancePolicy {
    private int insuranceAmount;
    private int payedInsuranceAmount;

    /**
     * Constructor which sets insurance amount to 100000
     * and payed insurance amount to 0
     */
    public VoluntaryMedicalInsurancePolicy() {
        this.insuranceAmount = 100000;
        this.payedInsuranceAmount = 0;
    }

    /**
     * Constructor which sets specified insurance amount, while
     * payed insurance amount will be set to 0
     * @param insuranceAmount
     * the insurance amount to set
     */
    public VoluntaryMedicalInsurancePolicy(int insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
        this.payedInsuranceAmount = 0;
    }

    /**
     * Get medical insurance amount
     * @return current medical insurance amount
     */
    public int getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Set medical insurance amount
     * @param insuranceAmount
     * the amount to set
     */
    public void setInsuranceAmount(int insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    /**
     * Get payed insurance amount
     * @return payed insurance amount
     */
    public int getPayedInsuranceAmount() {
        return payedInsuranceAmount;
    }

    /**
     * Set payed insurance amount
     * @param payedInsuranceAmount
     * the amount to set
     */
    public void setPayedInsuranceAmount(int payedInsuranceAmount) {
        this.payedInsuranceAmount = payedInsuranceAmount;
    }
}
