import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name = "";

        
        while(name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("User name: "+name);

        scanner.close();
        


        for(int i=10; i>=0; i--) {
            System.out.println(i);
        }


    }
}
