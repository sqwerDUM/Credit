package credit;

public class CreditOrganization { // Кредитная Организация является родительским классом
    private String name;
    private double interestRate;

    public CreditOrganization(String name, double interestRate) { // отец всех я вся
        this.name = name;
        this.interestRate = interestRate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInterest(double principal) {

        return principal * (interestRate / 100)  ;
    }
}

