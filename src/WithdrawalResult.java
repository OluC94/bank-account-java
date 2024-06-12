public class WithdrawalResult {
    private boolean isSuccessful;
    public float balance;

    public WithdrawalResult(boolean isSuccessful, float balance){
        this.isSuccessful = isSuccessful;
        this.balance = balance;
    }
}
