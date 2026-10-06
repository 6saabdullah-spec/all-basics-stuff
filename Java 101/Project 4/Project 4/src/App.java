import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.print("the price of the car: ");
        Double price = (reader.nextDouble());

        System.out.print("the intrest: ");
        Double intrest = (reader.nextDouble());

        Double total_intrest = (price * intrest / 100 * 5);
        System.out.println("the total intrest is: " + total_intrest);

        Double total_price = (price + total_intrest);
        System.out.println("the total price is: " + total_price);

        Double monthly_installment = (total_price / 60);
        System.out.println("the monthly installment is: " +  monthly_installment);

        reader.close();

    }
}
