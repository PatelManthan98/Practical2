public class p4saving extends p2
{
    public p4saving() {
    }
    public p4saving(int id, double balance) {
        super(id, balance);
    }
    public void withdraw(double money)
    {
        if(money<=getBalance()){
            super.withdraw(money);
        }
        else {
            System.out.println("Insufficient balance ");
        }
    }
}
