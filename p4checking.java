public class p4checking extends p2
{
    double overdraft = 5000;
    double overdraftCharge = 0.05;

    public p4checking() {
    }
    public p4checking(int id, double balance) {
        super(id, balance);
    }
    public void withdraw(double money) {
        // condition for over drafting money
        if (getBalance() - money <-overdraft) {
            super.withdraw(money);
            setBalance(getBalance()-money*overdraftCharge);
            System.out.println(money*overdraftCharge+"Rs. charge is deducted from your account.");
        } else {
            System.out.println("Can't overdraft money more than` " + overdraft + " Rs.");
        }
    }
}
