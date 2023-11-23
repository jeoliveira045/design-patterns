package liskov;

public class LoanClousureService {
    private SecureLoan secureLoan;

    public LoanClousureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }
    public void foreCloseLoan() {
        secureLoan.foreCloseLoan();;
    }
}
