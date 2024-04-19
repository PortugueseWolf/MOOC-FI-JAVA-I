import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println(
            "Commands:" + "\n" +
            "1 - add a joke" + "\n" +
            "2 - draw a joke" + "\n" +
            "3 - list jokes" + "\n" +
            "X - stop");
            
            String command = scanner.nextLine();

            if(command.equals("X")){
                scanner.close();
                break;
            }

            if(command.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                manager.addJoke(joke);
                continue;
            }

            if(command.equals("2")){
                System.out.println(manager.drawJoke());
                continue;
            }

            if(command.equals("3")){
                manager.printJokes();
                continue;
            }
            System.out.println("Command not recognized");
            
        }
    }
}
