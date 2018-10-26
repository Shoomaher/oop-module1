import java.util.Date;

public class Bill {
    private Date date;
    private int amountToPay;
    private enum typeOfService {
        body_check,
        dentistry,
        endocrinology,
        gynecology,
        ophthalmology,
        otolaryngia,
        surgery,
        traumatology

    }

    /**
     * Get bill date
     * @return date of the bill
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set date of the bill
     * @param date
     * the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Get total amount to pay
     * @return amount to pay
     */
    public int getAmountToPay() {
        return amountToPay;
    }

    /**
     * Set total amount to pay
     * @param amountToPay
     * the amount to set
     */
    public void setAmountToPay(int amountToPay) {
        if (amountToPay < 0)
            throw new IllegalArgumentException();
        this.amountToPay = amountToPay;
    }
}
