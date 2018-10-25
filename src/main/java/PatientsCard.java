public class PatientsCard {
    private String firstName;
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
    public PatientsCard(String firstName, String lastName) {
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
    public PatientsCard(String firstName, String lastName, String address) {
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
    public PatientsCard(String firstName, String lastName, String address, MedicalInsurancePolicy insurancePolicy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.insurancePolicy = insurancePolicy;
    }

    /**
     * get the first name of the person
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set the first name of the person
     * @param firstName
     * first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get last name of the peson
     * @return last name of person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set the first name of person
     * @param lastName
     * last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get address of the person
     * @return address of the person
     */
    public String getAddress() {
        return address;
    }

    /**
     * set address of the person
     * @param address
     * address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get medical insurance policy
     * @return insurance policy
     */
    public MedicalInsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    /**
     * set medial insurance policy
     * @param insurancePolicy
     * medical insurance policy to set
     */
    public void setInsuranceId(MedicalInsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }
}
