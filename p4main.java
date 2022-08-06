public class p4main
{
    public static void main(String[] args) {
        p4checking C = new p4checking(98,10000);
        p4saving S = new p4saving(99,700000);
        System.out.println("\nBefore Withdrawing:\n");
        System.out.println("\nAccount Details of checking object:");
        System.out.println(C);
        System.out.println("\nAccount Details of saving object:");
        System.out.println(S);

        C.withdraw(1203223);
        S.withdraw(75002);
        System.out.println("\nAfter Withdrawing:\n");
        System.out.println("\nAccount Details of checking object:");
        System.out.println(C);
        System.out.println("\nAccount Details of saving object:");
        System.out.println(S);
        System.out.println("Program is done by 21CE098 MANTHAN PATEL");
    }
}
