package entities;

public abstract class TaxPayer {
    private String name;
    private Double anualincome;

    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualincome) {
        this.name = name;
        this.anualincome = anualincome;
    }

    public String getName() {
        return name;
    }

    public Double getAnualincome() {
        return anualincome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnualincome(Double anualincome) {
        this.anualincome = anualincome;
    }

    public abstract double tax();
}
