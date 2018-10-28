import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PolyclinicTest {
    Polyclinic plc;
    PatientsCard[] patientsArray;
    SocialPatientsCard spc1;
    PaidPatientsCard spc2;

    @BeforeEach
    void setUp() {
        plc = new Polyclinic(42,
                "Pushkinskaya street, 22");

    patientsArray = new PatientsCard[3];
        spc1 = new SocialPatientsCard(
                "Mikhail",
                "Sarafanov",
                "Academician Korolev street, 72",
                new ObligatoryMedicalInsurancePolicy(
                        12233,
                        "OOO Company & Co"));

        spc2 = new PaidPatientsCard(
                        "Alexey",
                        "Petrovich",
                        "Myasoyedovskaya street, 21",
                        new VoluntaryMedicalInsurancePolicy());

        Bill b = new Bill();
        b.setAmountToPay(120);
        b.setDate(new Date(2007, 10, 22));
        spc2.addBill(b);

        patientsArray[0] = spc1;

        patientsArray[1] = spc2;

        patientsArray[2] = new SocialPatientsCard(
                "Petr",
                "Ivanovich",
                "Primorskiy bulvar street, 19",
                new ObligatoryMedicalInsurancePolicy(
                        12232,
                        "OOO Company & Co"));

        plc.setCards(patientsArray);
    }

    @Test
    void getCardsLength() {
        assertEquals(3, plc.getCardsLength());
    }

    @Test
    void getPatientsSorted() {
        for(PatientsCard p: plc.getPatientsSorted())
            System.out.println(p);
    }



    @Test
    void countObligatoryMedicalInsurancePolicyClients() {
        assertEquals(2, plc.countObligatoryMedicalInsurancePolicyClients());
    }

    @Test
    void countVoluntaryMedicalInsurancePolicyClients() {
        assertEquals(1, plc.countVoluntaryMedicalInsurancePolicyClients());
    }

    @Test
    void countPayedServiceClients() {
        assertEquals(1, plc.countPaidServiceClients());
    }

    @Test
    void countTotalAmountOfTransfers() {
        System.out.println(spc2.getBills());
        assertEquals(120, plc.countTotalAmountOfTransfers(10, 2007));
    }

    @Test
    void deleteCard() {
        plc.deleteCard(spc1.getInsurancePolicy().getPolicyId());

        assertEquals(2, plc.getCardsLength());

        for(PatientsCard p: plc.getCards())
            System.out.println(p);
    }
}