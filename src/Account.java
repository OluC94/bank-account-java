public class Account {
//    instance vairables
    private final int id;
    public float balance;


    public Account(int id, float balance ){
        this.id= id;
        this.balance = Utils.convertToCurrency(balance);

    }

    public void deposit(){}

    public void display(){
        System.out.println(
                "id: " + id + " balance: " + balance
        );
    }
}
