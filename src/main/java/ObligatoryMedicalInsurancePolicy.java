public class ObligatoryMedicalInsurancePolicy extends MedicalInsurancePolicy {
    public ObligatoryMedicalInsurancePolicy() {
    }

    public ObligatoryMedicalInsurancePolicy(int policyId, String insuranceCompanyName) {
        super(policyId, insuranceCompanyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Obligatory medical insurance policy with id: ");
        sb.append(this.getPolicyId());
        sb.append("\nOpened in ");
        sb.append(this.getInsuranceCompanyName());
        return sb.toString();
    }
}
