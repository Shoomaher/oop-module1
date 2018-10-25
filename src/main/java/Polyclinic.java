import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Polyclinic {
    private int num;
    private String address;
    private PatientsCard cards[];

    /**
     * Constructor which sets clinic number and address
     * Patients cards array is empty
     * @param num
     * clinic number to set
     * @param address
     * address to set
     */
    public Polyclinic(int num, String address) {
        this.num = num;
        this.address = address;
        this.cards = new PatientsCard[0];
    }

    /**
     * Constructor which sets clinic number, its address and
     * Patients cards array
     * @param num
     * clinic number to set
     * @param address
     * address to set
     * @param cards
     * link to the array on patients cards to set
     */
    public Polyclinic(int num, String address, PatientsCard[] cards) {
        this.num = num;
        this.address = address;
        this.cards = cards;
    }

    /**
     * get number of the clinic
     * @return clinic number
     */
    public int getNum() {
        return num;
    }

    /**
     * set number of the clinic
     * @param num
     * clinic number to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * get address of the clinic
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * set address of the clinic
     * @param address
     * address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get link to the array of patients cards
     * @return link to an array containing Patients Cards
     */
    public PatientsCard[] getCards() {
        return cards;
    }

    /**
     * set array containing patients cards
     * @param cards
     * array of cards to set
     */
    public void setCards(PatientsCard[] cards) {
        this.cards = cards;
    }

    /**
     * get size of the array, containing patients cards
     * @return length of patients cards containing array
     */
    public int getCardsLength() {
        return this.cards.length;
    }

    /**
     * get patient with the specified medical insurance policy
     * @param insurancePolicy
     * insurance id to find
     * @return patient card
     */
    public PatientsCard getPatient(MedicalInsurancePolicy insurancePolicy) {
        for(PatientsCard p: this.cards) {
            if (insurancePolicy.equals(p.getInsurancePolicy()))
                return p;
        }
        return null;
    }

    /**
     * find patients, who live by specified address
     * @param address
     * address where to search
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
     * add patient card to the clinic
     * @param pCard
     * patient card to add
     */
    public void addPatient(PatientsCard pCard) {
        int initLength = this.getCardsLength();
        PatientsCard[] newArray = new PatientsCard[initLength + 1];
        System.arraycopy(this.cards, 0, newArray, 0, initLength);
        newArray[initLength+1] = pCard;
        this.cards = newArray;
    }

    /**
     * get link to the array containing patients of the clinic
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
     * delete patient card with specified medical insurance policy
     * @param insurancePolicy
     * medical insurance policy to delete
     */
     public void deleteCard(MedicalInsurancePolicy insurancePolicy) {
        ArrayList<PatientsCard> newCardsArray = new ArrayList<>(Arrays.asList(this.cards));
        for(PatientsCard pCard : this.cards) {
            if (pCard.getInsurancePolicy().equals(insurancePolicy))
                newCardsArray.remove(pCard);
        }
        this.cards = (PatientsCard[]) newCardsArray.toArray();
    }
}
