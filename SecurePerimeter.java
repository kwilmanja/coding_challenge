import java.util.Scanner;
public class SecurePerimeter{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double perimeter;
        System.out.println("Width: ");
        double width = scan.nextDouble();
        System.out.println("Length: ");
        double length = scan.nextDouble();
        perimeter = 2 * width + 2 * length;
        System.out.println(perimeter);
    }
}