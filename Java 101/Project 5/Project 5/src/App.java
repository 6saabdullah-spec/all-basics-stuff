import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter the height of the tank :");
        Double height = (reader.nextDouble());

        System.out.print("Enter the width of the tank :");
        Double width = (reader.nextDouble());

        System.out.print("Enter the length of the tank : ");
        Double length = (reader.nextDouble());

        Double tanksize = (height * width * length);
        System.out.println("the tank size is :" + Math.round(tanksize));
        
        //square 1m = 1000Litter
        //extra code 
        Double litters = (tanksize * 1000);
        System.out.println("the tank has " + Math.round(litters) + (" litters of watter"));
        
        reader.close();
    }
}
