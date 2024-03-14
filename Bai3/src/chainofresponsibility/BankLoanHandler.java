package chainofresponsibility;

public class BankLoanHandler extends LoanHandler {
    @Override
    public void handleRequest(double amount) {
        if (amount <= 10000) {
            System.out.println("Bank can handle the loan.");
        } else if (successor != null) {
            successor.handleRequest(amount);
        }
    }
}
