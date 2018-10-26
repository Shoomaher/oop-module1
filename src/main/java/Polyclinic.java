import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * The type Polyclinic.
 */
public class Polyclinic {
    private int num;
    private String address;
    private PatientsCard cards[];

    /**
     * Constructor which sets clinic number and address
     * Patients cards array is empty
     * @param num     clinic number to set
     * @param address address to set
     */
    public Polyclinic(int num, String address) {
        this.num = num;
        this.address = address;
        this.cards = new PatientsCard[0];
    }

    /**
     * Constructor which sets clinic number, its address and
     * Patients cards array
     * @param num     clinic number to set
     * @param address address to set
     * @param cards   link to the array on patients cards to set
     */
    public Polyclinic(int num, String address, PatientsCard[] cards) {
        this.num = num;
        this.address = address;
        this.cards = cards;
    }

    /**
     * Get number of the clinic
     * @return clinic number
     */
    public int getNum() {
        return num;
    }

    /**
     * Set number of the clinic
     * @param num clinic number to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * Get address of the clinic
     * @return address address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address of the clinic
     * @param address address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get link to the array of patients cards
     * @return link to an array containing Patients Cards
     */
    public PatientsCard[] getCards() {
        return cards;
    }

    /**
     * Set array containing patients cards
     * @param cards array of cards to set
     */
    public void setCards(PatientsCard[] cards) {
        this.cards = cards;
    }

    /**
     * Get size of the array, containing patients cards
     * @return length of patients cards containing array
     */
    public int getCardsLength() {
        return this.cards.length;
    }

    /**
     * Get patient with the specified medical insurance id
     * @param insuranceId insurance id to find
     * @return patient card
     */
    public PatientsCard getPatient(int insuranceId) {
        for(PatientsCard p: this.cards) {
            if (insuranceId == p.getInsurancePolicy().getPolicyId())
                return p;
        }
        return null;
    }

    /**
     * Find patients, who live by specified address
     * @param address address where to search
     * @return array containing patients cards
     */
    public PatientsCard[] getPatients(String address) {
        ArrayList<PatientsCard> patients = new ArrayList<>();
        for (PatientsCard p : this.cards) {
            if (address.equals(p.getAddress()))
                patients.add(p);
        }
        if (patients.size() == 0)
            return null;
        else
            return (PatientsCard[]) patients.toArray();
    }

    /**
     * Add patient card to the clinic
     * @param pCard patient card to add
     */
    public void addPatient(PatientsCard pCard) {
        if (pCard == null)
            throw new IllegalArgumentException();

        int initLength = this.getCardsLength();
        PatientsCard[] newArray = new PatientsCard[initLength + 1];
        System.arraycopy(this.cards, 0, newArray, 0, initLength);
        newArray[initLength+1] = pCard;
        this.cards = newArray;
    }

    /**
     * Get link to the array containing patients of the clinic
     * sorted by their addresses
     * @return array containing patients cards
     */
    public PatientsCard[] getPatientsSorted() {
        int initLength = this.getCardsLength();
        PatientsCard[] sortedArray = new PatientsCard[initLength];
        System.arraycopy(this.cards, 0, sortedArray, 0, initLength);

        Arrays.sort(sortedArray, Comparator.comparing(PatientsCard::getAddress));
        return sortedArray;
    }

    /**
     * Delete patient card with specified id
     * @param insuranceId medical insurance id to delete
     */
    public void deleteCard(int insuranceId) {
        ArrayList<PatientsCard> newCardsArray = new ArrayList<>(Arrays.asList(this.cards));
        for(PatientsCard pCard : this.cards) {
            if (pCard.getInsurancePolicy().getPolicyId() == insuranceId)
                newCardsArray.remove(pCard);
        }
         this.cards = (PatientsCard[]) newCardsArray.toArray();
     }

    /**
     * Count obligatory medical insurance policy clients
     * @return the amount of clients
     */
    public int countObligatoryMedicalInsurancePolicyClients() {
        int clients = 0;
        for(PatientsCard c: this.cards) {
           if(c.getInsurancePolicy() instanceof ObligatoryMedicalInsurancePolicy)
               clients++;
        }
        return clients;
     }

    /**
     * Count voluntary medical insurance policy clients
     * @return the amount of clients
     */
    public int countVoluntaryMedicalInsurancePolicyClients() {
        int clients = 0;
        for(PatientsCard c: this.cards) {
           if(c.getInsurancePolicy() instanceof VoluntaryMedicalInsurancePolicy)
               clients++;
        }
        return clients;
     }

    /**
     * Count payed service clients
     * @return the amount of clients
     */
    public int countPayedServiceClients() {
        int clients = 0;
        for(PatientsCard c: this.cards) {
            if (c instanceof PaidPatientsCard) {
                if (((PaidPatientsCard) c).getTotalAmount() > 0) {
                   clients++;
                }
            }
        }
        return clients;
     }

    /**
     * Count total amount of transfers for specified month and year
     * @param month the month
     * @param year  the year
     * @return total amount of money
     */
    public long countTotalAmountOfTransfers(int month, int year) {
         long totalMoney = 0;
         for (PatientsCard c : this.cards) {
             if (c instanceof PaidPatientsCard) {
                 ArrayList<Bill> bills = ((PaidPatientsCard) c).getBills();
                 for (Bill b : bills) {
                     Date billDate = b.getDate();
                     if (billDate.getMonth() == month & billDate.getYear() == year) {
                         totalMoney += b.getAmountToPay();
                     }
                 }
             }
         }
         return totalMoney;
     }
}
