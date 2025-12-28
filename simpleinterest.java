
import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            
            System.out.println("Enter principle of value");
float principle=sc.nextFloat();
System.out.println("Enter rate of value");
float rate=sc.nextFloat();
System.out.println("Enter time of value");
float time=sc.nextFloat();
float simpleinterest= (principle*rate*time)/100;
System.out.println("to take out simpleinterest" +simpleinterest);
    }
}
