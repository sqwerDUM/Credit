// По заданию нам нужно рассчитать где выгоднее взять кредит у трех разных Кредитных Организаций:
// банки, микрокредитные компаний, кредитный союз.
// Так же открыть дипозит.

import credit.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Logos ", 35.0, 5, true, 15, true);
        MicroCreditCompany microCreditCompany = new MicroCreditCompany(" SqqWer Micro Credits", 40.0);
        CreditUnion creditUnion = new CreditUnion(" Secret Union Credit", 40.0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сумма которую мы хотим взять : ");
        double loanAmount = scanner.nextDouble();


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        double interestAmountBank = bank.calculateInterest(loanAmount);
        double interestAmountMicroCredit = microCreditCompany.calculateInterest(loanAmount);
        double interestAmountCreditUnion = creditUnion.calculateInterest(loanAmount);


        System.out.println("Сумма процентов по кредиту в банке " + bank.getName() + ": " + interestAmountBank);
        System.out.println("Сумма процентов по кредиту в МКК" + microCreditCompany.getName() + ": " + interestAmountMicroCredit);
        System.out.println("Сумма процентов по кредиту в КС" + creditUnion.getName() + ": " + interestAmountCreditUnion);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////

        if (interestAmountBank < interestAmountMicroCredit) {
            System.out.println("Выгоднее брать кредит в " + bank.getName());
        } else if (interestAmountBank == interestAmountMicroCredit) {
            System.out.println("В" + bank.getName() + "и" + microCreditCompany.getName()+ "одинаково");
        } else if (interestAmountMicroCredit < interestAmountCreditUnion) {
            System.out.println("Выгоднее брать кредит в" + microCreditCompany.getName());
        } else if (interestAmountMicroCredit == interestAmountCreditUnion) {
            System.out.println("В" + microCreditCompany.getName()+ "и" + creditUnion.getName()+ "одинаково");
        } else if (interestAmountBank == interestAmountCreditUnion) {
            System.out.println("В" + bank.getName()+ "и"+creditUnion.getName() + "одинаково");
        } else {
            System.out.println("Выгоднее брать кредит в" + creditUnion);
        }

        System.out.println("\n\n\n");

        if (bank.acceptsDeposits()) {

            System.out.println("Взнос в депозит банка :" + bank.getName());
            double contribution = scanner.nextDouble();
            double interstContribution = bank.deposit(contribution);
            System.out.println("Сумма по окончанию дипозитного счета в банке " + bank.getName() + ": " + (interstContribution + contribution));

        }
        else {
            System.out.println("На данный момент банк " + bank.getName() + "на данный момент не открывает дипозиты");
        }
    }
}

