public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("На вашем балансе: " + amount);
    }

    public void WithDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("Не хватает денег на балансе", getAmount());
        }
        amount -= sum;
        System.out.println("C вашего баланса было вычитано: -" + sum);
        System.out.println("На вашем балансе осталось: " + amount);


    }
}
