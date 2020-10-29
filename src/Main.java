public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true) {
            try {
                bankAccount.WithDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println(bankAccount.getAmount()-bankAccount.getAmount());
                break;

            }
        }
    }
}