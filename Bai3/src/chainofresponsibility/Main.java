package chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng xử lý
        LoanHandler bankLoanHandler = new BankLoanHandler();
        LoanHandler creditHistoryHandler = new CreditHistoryHandler();
        LoanHandler identityVerificationHandler = new IdentityVerificationHandler();

        // Thiết lập sự kế thừa giữa các đối tượng xử lý
        bankLoanHandler.setSuccessor(creditHistoryHandler);
        creditHistoryHandler.setSuccessor(identityVerificationHandler);

        // Gọi phương thức xử lý yêu cầu
        bankLoanHandler.handleRequest(20000);
    }
}

