public class PatientsCard {
    private String firstName;
    private String lastName;
    private String adress;
    private int insuranceId;

    public PatientsCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.insuranceId = 0;
    }

    public PatientsCard(String firstName, String lastName, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.insuranceId = 0;
    }

    public PatientsCard(String firstName, String lastName, String adress, int insuranceId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.insuranceId = insuranceId;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }
}
