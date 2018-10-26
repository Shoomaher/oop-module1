import java.util.ArrayList;
import java.util.Date;

/**
 * The type Payed patients card.
 */
public class PayedPatientsCard implements PatientsCard {

    private String firstName;
    private String lastName;
    private String address;
    private MedicalInsurancePolicy insurancePolicy;
    private ArrayList<Bill> bills;

    /**
     * Instantiates a new Payed patients card.
     */
    public PayedPatientsCard() {
        this.bills = new ArrayList<>(0);
    }


    /**
     * Instantiates a new Payed patients card.
     *
     * @param firstName the first name
     * @param lastName  the last name
     */
    public PayedPatientsCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.insurancePolicy = null;
        this.address = "";
        this.bills = new ArrayList<>(0);
    }

    public PayedPatientsCard(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.insurancePolicy = null;
        this.bills = new ArrayList<>(0);
    }

    public PayedPatientsCard(String firstName, String lastName, String address, MedicalInsurancePolicy insurancePolicy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.insurancePolicy = insurancePolicy;
        this.bills = new ArrayList<>(0);
    }

    public PayedPatientsCard(String firstName, String lastName, String address, MedicalInsurancePolicy insurancePolicy, ArrayList<Bill> payedBills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.insurancePolicy = insurancePolicy;
        this.bills = payedBills;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public int getTotalAmount() {
        int sum = 0;
        for(Bill b:this.bills) {
           sum+=b.getAmountToPay();
        }
        return sum;
    }

    public ArrayList<Bill> getBillsByDate(Date date) {
        ArrayList<Bill>  bills = new ArrayList<>(0);
        for(Bill b: this.bills) {
            if (date.equals(b.getDate()))
                bills.add(b);
        }
        return bills;
    }

    public void addBill(Bill bill) {
        this.bills.add(bill);
    }

    public void deleteBill(Date date, int amount) {
        ArrayList <Bill> currentBills = this.getBillsByDate(date);
        for(Bill b: currentBills) {
            if (amount == b.getAmountToPay())
                this.bills.remove(b);
        }
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public void setFirstName(String name) {

    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void setLastName(String name) {

    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }

    @Override
    public MedicalInsurancePolicy getInsurancePolicy() {
        return null;
    }

    @Override
    public void setInsurancePolicy(MedicalInsurancePolicy insurancePolicy) {

    }
}
