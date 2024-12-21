import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Two Numbers");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(x + " / " + y + " = " + z); 
        } catch (ArithmeticException ex) {
            System.out.println("--- catch block ---");
            System.out.println(ex.toString());
        } finally {
            System.out.println("--- finally block ---");
            System.out.println("Application Designed & Developed");

            System.out.println("Team Hunnu");
            sc.close();
        }
        System.out.println("--- Done ---");

    }
}