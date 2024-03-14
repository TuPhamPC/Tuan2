package chainofresponsibility;

public abstract class LoanHandler {
    protected LoanHandler successor;

    public void setSuccessor(LoanHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(double amount);
}

