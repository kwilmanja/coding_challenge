import java.util.Scanner;
public class HappyNumbers{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Number: ");
        String initialNumber = Integer.toString(scan.nextInt());
        String number = initialNumber;
        int sum = 0;
        int count = 0;
        int previousSum = 1;

        while (sum != 1 && count < 100){
            int length = number.length();
            sum = 0;
            for (int i = 0; i < length; i++){
                int n = Integer.parseInt(number.substring(i, i + 1));
                sum += n * n;
            }
            number = Integer.toString(sum);

            count++;
        }
        if (sum == 1){
            System.out.println(initialNumber + " is a happy number");
        } else {
            System.out.println(initialNumber + " is an unhappy number");
        }
        
    }
}