import java.util.Scanner;

public class Try_exept {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            
            System.out.println("Enter your number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter your number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);

        }
        catch(Exception e) {
            System.out.println("Are you dumb??? \nYou can't divide by zero!");
        }
        finally{
            System.out.println("Compilation finished succesfully");
            scanner.close();
        }
    }
}
