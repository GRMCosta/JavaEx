package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private double installment;
    private Date insDate;

    public Installment(double installment, Date insDate) {
        this.installment = installment;
        this.insDate = insDate;
    }

    public double getInstallment() {
        return installment;
    }

    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }

    @Override
    public String toString() {
        return sdf.format(insDate) + "-" + String.format("%.2f", installment);
    }
}
