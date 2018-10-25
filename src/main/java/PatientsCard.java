public class PatientsCard {
    private String firstName;
    private String lastName;
    private String address;
    private int insuranceId;

    /**
     * Constructor which creates patient card with specified first and last name.
     * Medical insurance id will be set to 0.
     * @param firstName
     * first name to set
     * @param lastName
     * last name to set
     */
    public PatientsCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.insuranceId = 0;
    }

    /**
     * Constructor which creates patient card with specified first name,
     * last name and address.
     * Mecical insurance id will be set to 0.
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
        this.insuranceId = 0;
    }

    /**
     * Constructor which creates patient card with specified first name,
     * last name, address and medical insurance id
     * @param firstName
     * first name to set
     * @param lastName
     * last name to set
     * @param address
     * address to set
     * @param insuranceId
     * medical insurance id to set
     */
    public PatientsCard(String firstName, String lastName, String address, int insuranceId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.insuranceId = insuranceId;
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
     * get medical insurance id
     * @return medical insurance id
     */
    public int getInsuranceId() {
        return insuranceId;
    }

    /**
     * set medial insurance id
     * @param insuranceId
     * medical insurance id to set
     */
    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }
}
