import static org.junit.jupiter.api.Assertions.*;

class SocialPatientsCardTest {
    SocialPatientsCard spc1;
    SocialPatientsCard spc2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        spc1 = new SocialPatientsCard(
                "Mikhail",
                "Sarafanov",
                "Academician Korolev street, 72",
                new ObligatoryMedicalInsurancePolicy(
                        12232,
                        "OOO Company & Co"));
        spc2 = new SocialPatientsCard(
                "Mikhail",
                "Sarafanov",
                "Academician Korolev street, 72",
                new ObligatoryMedicalInsurancePolicy(
                        12232,
                        "OOO Company & Co"));
    }

    @org.junit.jupiter.api.Test
    void equalsTest() {
        assertEquals(spc1.equals(spc2), true);
        System.out.println(spc1);
    }

    @org.junit.jupiter.api.Test
    void hashCodeTest() {
        assertNotEquals(spc1.hashCode(), spc2.hashCode());
    }
}