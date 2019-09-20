package entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualincome, Integer numberOfEmployees) {
        super(name, anualincome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if(numberOfEmployees <= 10){
            return getAnualincome() * 0.16;
        }
        else{
            return getAnualincome() * 0.14;
        }
    }
}
