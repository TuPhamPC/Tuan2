package chainofresponsibility;

public class CreditHistoryHandler extends LoanHandler {
    @Override
    public void handleRequest(double amount) {
        if (amount <= 50000) {
            System.out.println("Credit history verified.");
        } else if (successor != null) {
            successor.handleRequest(amount);
        }
    }
}
