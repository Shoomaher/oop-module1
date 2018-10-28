import java.util.Objects;

public class SocialPatientsCard implements PatientsCard { private String firstName;
    private String lastName;
    private String address;
    private MedicalInsurancePolicy insurancePolicy;

    /**
     * Constructor which creates patient card with specified first and last name.
     * Insurance policy will be set to null
     * @param firstName
     * first name to set
     * @param lastName
     * last name to set
     */
    public SocialPatientsCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.insurancePolicy = null;
    }

    /**
     * Constructor which creates patient card with specified first name,
     * last name and address.
     * Insurance policy will be set to null
     * @param firstName
     * first name to set
     * @param lastName
     * last name to set
     * @param address
     * address to set
     */
    public SocialPatientsCard(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.insurancePolicy = null;
    }

    /**
     * Constructor which creates patient card with specified first name,
     * last name, address and medical insurance policy
     * @param firstName
     * first name to set
     * @param lastName
     * last name to set
     * @param address
     * address to set
     * @param insurancePolicy
     * medical insurance policy to set
     */
    public SocialPatientsCard(String firstName, String lastName, String address, MedicalInsurancePolicy insurancePolicy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.insurancePolicy = insurancePolicy;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MedicalInsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(MedicalInsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SocialPatientsCard
                && this.firstName.equals(((SocialPatientsCard) obj).firstName)
                && this.lastName.equals(((SocialPatientsCard) obj).lastName)
                && this.address.equals(((SocialPatientsCard) obj).address)
                && this.insurancePolicy.equals(((SocialPatientsCard) obj).insurancePolicy)) {

            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 123456789 ^ this.firstName.hashCode() ^ this.lastName.hashCode() ^ this.address.hashCode() ^ insurancePolicy.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Social Patients Card\nHis first name: ");
        sb.append(firstName);
        sb.append("\nHis last name: ");
        sb.append(lastName);
        sb.append("\nHis address: ");
        sb.append(address);
        sb.append("\nHis medical insurance policy: ");
        sb.append(insurancePolicy.toString());
        return sb.toString();
    }
}
