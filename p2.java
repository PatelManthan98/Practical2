import java.util.Date;

public class p2
{
    private int id=0;
    private double balance=500;
    private double annual=0.07;
    private Date date = new Date();
    p2(){}
    p2(int id,double balance)
    {
        this.id=id;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnual() {
        return annual;
    }

    public void setAnnual(double annual) {
        this.annual = annual;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public double getmonthlyrate()
    {
        return annual/12;
    }
    public  double getmonthlyinterest()
    {
        return balance*(annual/1200);
    }
    public double withdraw(double d)
    {
        balance=balance-d;
        return balance;
    }
    public double deposit(double d)
    {
        balance=balance+d;
        return balance;
    }
}
