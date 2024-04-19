
public class YourFirstAccount {
    public static void main (String[] args) {
        Account tester = new Account("tester", 100.0);

        tester.deposit(20.0);
        System.out.println(tester);


    }
}
