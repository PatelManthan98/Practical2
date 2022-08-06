public class p2main
{
    public static void main(String[] args) {
        p2 a = new p2(98,150000);
        System.out.println("Annual Interest:"+a.getAnnual()+"%");
        System.out.println("Balance:"+a.getBalance());
        System.out.println("Id:"+a.getId());
        System.out.println("Monthly Interest rate:"+a.getmonthlyrate());
        System.out.println("Get monthly Interest:"+a.getmonthlyinterest());
        System.out.println("Balance After deposit:"+a.deposit(50000));
        System.out.println("Balance After withdraw:"+a.withdraw(12500));
        System.out.println("Program done by 21CE098 MANTHAN PATEL");
    }
}
