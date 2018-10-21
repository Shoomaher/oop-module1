import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Polyclinic {
    private int num;
    private String address;
    private PatientsCard cards[];

    public Polyclinic(int num, String address) {
        this.num = num;
        this.address = address;
        this.cards = new PatientsCard[0];
    }

    public Polyclinic(int num, String address, PatientsCard[] cards) {
        this.num = num;
        this.address = address;
        this.cards = cards;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PatientsCard[] getCards() {
        return cards;
    }

    public void setCards(PatientsCard[] cards) {
        this.cards = cards;
    }

    public int getCardsLength() {
        return this.cards.length;
    }

    public PatientsCard getPatient(int insuranceId) {
        for(PatientsCard p: this.cards) {
            if (insuranceId == p.getInsuranceId())
                return p;
        }
        return null;
    }

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

    public void addPatient(PatientsCard pCard) {
        int initLength = this.getCardsLength();
        PatientsCard[] newArray = new PatientsCard[initLength + 1];
        System.arraycopy(this.cards, 0, newArray, 0, initLength);
        newArray[initLength+1] = pCard;
        this.cards = newArray;
    }

     public PatientsCard[] getPatientsSorted() {
         int initLength = this.getCardsLength();
         PatientsCard[] sortedArray = new PatientsCard[initLength];
         System.arraycopy(this.cards, 0, sortedArray, 0, initLength);

         Arrays.sort(sortedArray, Comparator.comparing(PatientsCard::getAddress));
         return sortedArray;
     }

     public void deleteCard(int insuranceId) {
        ArrayList<PatientsCard> newCardsArray = new ArrayList<>(Arrays.asList(this.cards));
        for(PatientsCard pCard : this.cards) {
            if (pCard.getInsuranceId() == insuranceId)
                newCardsArray.remove(pCard);
        }
        this.cards = (PatientsCard[]) newCardsArray.toArray();
    }

}
