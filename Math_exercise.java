import java.util.Scanner;

public class Math_exercise {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x of the triangle: ");
        double x = scanner.nextDouble();

        System.out.println("Enter side y of the triangle: ");
        double y = scanner.nextDouble();

        double z = Math.sqrt((x*x)+(y*y));

        System.out.println("z side of the triangle is equal to: "+z);

        scanner.close();
        
    }
}
