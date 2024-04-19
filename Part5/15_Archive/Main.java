import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.equals("")){
                scanner.close();
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.equals("")){
                scanner.close();
                break;
            }
            int alreadyInArchive = 0;
            Archive test = new Archive(identifier, name);
            for(Archive tester : archive){
                if(identifier.equals(tester.getIdentifier())){
                    alreadyInArchive ++;
                }
            }
            if(alreadyInArchive == 0){
                archive.add(test);
            }
        }

        System.out.println("==ITEMS==");
        for(Archive printer : archive){
            System.out.println(printer);
        }
    }
}
