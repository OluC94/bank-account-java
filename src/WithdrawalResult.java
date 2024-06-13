public class WithdrawalResult {
    public WithdrawalResult result;
    public WithdrawalResult(String outcome, float balance){

    }

    public WithdrawalResult getWithdrawalResult(){
        return this;
    }

}


// output of withdraw result: {outcome: "success" or "failure", balance: float}