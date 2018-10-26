/**
 * The interface Patients card.
 */
public interface PatientsCard {
    /**
     * Gets first name.
     * @return the first name
     */
    String getFirstName();

    /**
     * Sets first name.
     * @param name the name
     */
    void setFirstName(String name);

    /**
     * Gets last name.
     * @return the last name
     */
    String getLastName();

    /**
     * Sets last name.
     * @param name the name
     */
    void setLastName(String name);

    /**
     * Gets address.
     * @return the address
     */
    String getAddress();

    /**
     * Sets address.
     * @param address the address
     */
    void setAddress(String address);

    /**
     * Gets insurance policy.
     * @return the insurance policy
     */
    MedicalInsurancePolicy getInsurancePolicy();

    /**
     * Sets insurance policy.
     * @param insurancePolicy the insurance policy
     */
    void setInsurancePolicy(MedicalInsurancePolicy insurancePolicy);
}