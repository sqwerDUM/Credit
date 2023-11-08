package credit;

public class Bank extends CreditOrganization {
    private boolean acceptsDeposits;
    private boolean doesMoneyTransfers;
    private double taxRate;
    private double percentDeposit;


    public Bank(String name, double interestRate, double taxRate, boolean acceptsDeposits, double percentDeposit, boolean doesMoneyTransfers) {
        super(name, interestRate); // конструктор
        this.acceptsDeposits = acceptsDeposits;
        this.doesMoneyTransfers = doesMoneyTransfers;
        this.percentDeposit = percentDeposit;
        this.taxRate = taxRate;
    }

    public boolean acceptsDeposits() {
        return acceptsDeposits;
    }

    public boolean doesMoneyTransfers() {
        return doesMoneyTransfers;
    }

    @Override
    public double calculateInterest(double principal) {
        double percent = super.calculateInterest(principal);
        double tax = percent * (taxRate / 100);
        return tax + percent;
    }

    public double deposit(double principal) {

            return principal * (percentDeposit / 100);
        }
    }

