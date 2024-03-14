package chainofresponsibility;

public class IdentityVerificationHandler extends LoanHandler {
    @Override
    public void handleRequest(double amount) {
        System.out.println("Identity verified.");
    }
}
