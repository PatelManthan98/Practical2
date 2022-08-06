import java.util.Scanner;
public class p3
{
    private int ID;
    public float Withdraw_balance;
    private float amount;
    String name;
    Scanner sc = new Scanner(System.in);
    public float balance = 300;

    public void get()
    {
        System.out.println("Please Enter Your Id no  :");
        ID =sc.nextInt();
    }

    public void checkID()
    {
        if(ID >= 1 && ID<=10  )
        {
            System.out.println("Your ID is correct please next enter your choice : ");
            System.out.println("1 = Balance inquiry");
            System.out.println("2 = Withdraw Money");
            System.out.println("3 = Deposit Money");
            System.out.println("4= Money transfer");
            System.out.println("5 = Create Account");
            System.out.println("6 = De-active Account");
            System.out.println("7 = Exit");

            final  int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    print_balance();
                    break;
                }

                case 2:
                {
                    Withdraw_Money();
                    break;
                }
                case 3:
                {
                    Deposit_Money();
                    break;
                }
                case 4:
                {
                    Money_Transfer();
                    break;
                }
                case 5:
                {
                    Create_Account();
                }
            }



        }
    }

    private void Create_Account()
    {

        System.out.println("Enter account no. to transfer money:");
        ID=sc.nextInt();
        System.out.println("Enter amount of transfer:");
        amount=sc.nextInt();
    }

    private void print_balance()
    {
        System.out.println("Main Balance:"+balance);
    }
    private void Deposit_Money()
    {
        System.out.println("Enter the amount you want to deposit:");
        amount = sc.nextInt();
        balance = balance+ amount;
        System.out.println("Main balance:"+balance);
    }
    private void  Withdraw_Money()
    {
        System.out.println("Please enter how much money you want to withdraw");
        Withdraw_balance = sc.nextInt();
        if(Withdraw_balance <= balance) {
            System.out.println("Take the money");
            Withdraw_balance = balance - Withdraw_balance;
            System.out.println(" Remaining Balance:"+Withdraw_balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    private void Money_Transfer()
    {
        p3 atm = new p3();
        if(balance - amount >= 300)
        {
            balance -= amount;
            atm.balance += amount;
            System.out.println(amount+"RS successfully Transferred.");
            System.out.println("Remaining balance:"+balance);
        }
        else {
            System.out.println("Insufficient balance");
        }

    }

}
