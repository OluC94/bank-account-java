//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Account testAccount = new Account(5, 654.444f);
        testAccount.display();
//        testAccount.deposit(55);
//        testAccount.deposit(-65);
//        testAccount.display();
        System.out.println(testAccount.withdraw(500));
        System.out.println(testAccount.withdraw(7000));
        testAccount.display();
//        System.out.println(testAccount.getBankStatement());


    }
}

//https://weareacademy.notion.site/Bank-Account-etc-class-syntax-practice-cfd795ee3cdc4f509fd084b48fdf8eaf