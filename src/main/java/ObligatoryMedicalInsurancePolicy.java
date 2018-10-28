public class ObligatoryMedicalInsurancePolicy extends MedicalInsurancePolicy {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Obligatory medical insurance policy with id: ");
        sb.append(this.getPolicyId());
        sb.append("\nOpened in ");
        sb.append(this.getInsuranceCompanyName());
        return sb.toString();
    }
}
