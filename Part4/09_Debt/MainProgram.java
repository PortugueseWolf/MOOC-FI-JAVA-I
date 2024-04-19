
public class MainProgram {
    public static void main(String[] args) {
        Debt morgage = new Debt(120000.0, 1.01);
        morgage.printBalance();
        morgage.waitOneYear();
        morgage.printBalance();
    }
}
