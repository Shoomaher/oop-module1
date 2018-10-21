public class PatientsCard {
    private String firstName;
    private String lastName;
    private String address;
    private int insuranceId;

    /**
     * @param firstName
     * @param lastName
     */
    public PatientsCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.insuranceId = 0;
    }

    /**
     * @param firstName
     * @param lastName
     * @param adress
     */
    public PatientsCard(String firstName, String lastName, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = adress;
        this.insuranceId = 0;
    }

    /**
     * @param firstName
     * @param lastName
     * @param adress
     * @param insuranceId
     */
    public PatientsCard(String firstName, String lastName, String adress, int insuranceId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = adress;
        this.insuranceId = insuranceId;
    }

    /**
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return insuranceId
     */
    public int getInsuranceId() {
        return insuranceId;
    }

    /**
     * @param insuranceId
     */
    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }
}
