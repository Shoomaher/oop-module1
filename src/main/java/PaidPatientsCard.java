import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 * The type Payed patients card.
 */
public class PaidPatientsCard implements PatientsCard {

    private String firstName;
    private String lastName;
    private String address;
    private MedicalInsurancePolicy insurancePolicy;
    private ArrayList<Bill> bills;

    /**
     * Instantiates a new Payed patients card.
     */
    public PaidPatientsCard() {
        this.bills = new ArrayList<>(0);
    }


    /**
     * Instantiates a new Payed patients card.
     * @param firstName the first name
     * @param lastName  the last name
     */
    public PaidPatientsCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.insurancePolicy = null;
        this.address = "";
        this.bills = new ArrayList<>(0);
    }

    /**
     * Instantiates a new Paid patients card.
     * @param firstName the first name
     * @param lastName  the last name
     * @param address   the address
     */
    public PaidPatientsCard(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.insurancePolicy = null;
        this.bills = new ArrayList<>(0);
    }

    /**
     * Instantiates a new Paid patients card.
     * @param firstName       the first name
     * @param lastName        the last name
     * @param address         the address
     * @param insurancePolicy the insurance policy
     */
    public PaidPatientsCard(String firstName, String lastName, String address, MedicalInsurancePolicy insurancePolicy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.insurancePolicy = insurancePolicy;
        this.bills = new ArrayList<>(0);
    }

    /**
     * Instantiates a new Paid patients card.
     * @param firstName       the first name
     * @param lastName        the last name
     * @param address         the address
     * @param insurancePolicy the insurance policy
     * @param payedBills      the payed bills
     */
    public PaidPatientsCard(String firstName, String lastName, String address, MedicalInsurancePolicy insurancePolicy, ArrayList<Bill> payedBills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.insurancePolicy = insurancePolicy;
        this.bills = payedBills;
    }

    /**
     * Gets bills.
     * @return the bills
     */
    public ArrayList<Bill> getBills() {
        return bills;
    }

    /**
     * Sets bills.
     * @param bills the bills
     */
    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    /**
     * Gets total amount.
     * @return the total amount
     */
    public int getTotalAmount() {
        int sum = 0;
        for(Bill b:this.bills) {
           sum+=b.getAmountToPay();
        }
        return sum;
    }

    /**
     * Gets bills by date.
     * @param date the date
     * @return the bills by date
     */
    public ArrayList<Bill> getBillsByDate(Date date) {
        ArrayList<Bill>  bills = new ArrayList<>(0);
        for(Bill b: this.bills) {
            if (date.equals(b.getDate()))
                bills.add(b);
        }
        return bills;
    }

    /**
     * Add bill.
     *
     * @param bill the bill
     */
    public void addBill(Bill bill) {
        this.bills.add(bill);
    }

    /**
     * Delete bill for specified date and amount
     *
     * @param date   the date
     * @param amount the amount
     */
    public void deleteBill(Date date, int amount) {
        ArrayList <Bill> currentBills = this.getBillsByDate(date);
        for(Bill b: currentBills) {
            if (amount == b.getAmountToPay())
                this.bills.remove(b);
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MedicalInsurancePolicy getInsurancePolicy() {
        return this.insurancePolicy;
    }

    public void setInsurancePolicy(MedicalInsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PaidPatientsCard
                && this.firstName.equals(((PaidPatientsCard) obj).firstName)
                && this.lastName.equals(((PaidPatientsCard) obj).lastName)
                && this.address.equals(((PaidPatientsCard) obj).address)
                && this.insurancePolicy.equals(((PaidPatientsCard) obj).insurancePolicy)
                && this.bills.equals(((PaidPatientsCard) obj).bills)) {

            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 123456789
                ^ this.firstName.hashCode()
                ^ this.lastName.hashCode()
                ^ this.address.hashCode()
                ^ this.insurancePolicy.hashCode()
                ^ this.bills.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Paid Patients Card\nHis first name: ");
        sb.append(firstName);
        sb.append("\nHis last name: ");
        sb.append(lastName);
        sb.append("\nHis address: ");
        sb.append(address);
        sb.append("\nHis medical insurance policy: ");
        sb.append(insurancePolicy.toString());
        sb.append("\nList of his bills: ");
        sb.append(bills.toString());
        return sb.toString();
    }
}
