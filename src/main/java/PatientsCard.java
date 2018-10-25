public interface PatientsCard {
    String getFirstName();
    void setFirstName(String name);
    String getLastName();
    void setLastName(String name);
    String getAddress();
    void setAddress(String address);
    MedicalInsurancePolicy getInsurancePolicy();
    void setInsurancePolicy(MedicalInsurancePolicy insurancePolicy);
}