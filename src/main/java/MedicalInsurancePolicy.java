abstract class MedicalInsurancePolicy {
    private int policyId;
    private String insuranceCompanyName;

    /**
     * Creates object, sets policy id to 0 and leaves name of the company empty
     */
    public MedicalInsurancePolicy() {
        this.policyId = 0;
    }

    /**
     * Creates object and sets policy id and name of the insurance company
     * @param policyId
     * Insurance policy id to set
     * @param insuranceCompanyName
     * Insurance company name to set
     */
    public MedicalInsurancePolicy(int policyId, String insuranceCompanyName) {
        this.policyId = policyId;
        this.insuranceCompanyName = insuranceCompanyName;
    }

    /**
     * Get number of the medical insurance policy
     * @return number of the policy
     */
    public int getPolicyId() {
        return policyId;
    }

    /**
     * Set medical insurance policy number
     * @param policyId
     * Insurance policy number to set
     */
    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    /**
     * Get name of the insurance company
     * @return name of the company
     */
    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    /**
     * Set name of the medical insurance company
     * @param insuranceCompanyName
     * Name of the company to set
     */
    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }
}
