import java.util.Scanner;

public class Problem_1 {
    
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
    
        System.out.println("Enter first number");
        double a = ob.nextDouble();
        
        System.out.println("Enter second number");
        double b= ob.nextDouble();

        System.out.println("Enter the operation :");
        System.out.println("Enter + for addition");
        System.out.println("Enter - for Subtraction");
        System.out.println("Enter * for Multiplication");
        System.out.println("Enter / for division");
        char ch= ob.next().charAt(0);

        switch(ch){
            case '+':
                System.out.println("Addition : "+(a+b));
                break;

            case '-':
                System.out.println("Subtraction "+a+"-"+b+" : " + (a - b));
                System.out.println("Subtraction " + b + "-" +a + " : " +(b - a));
                break;
            
            case '*':
                System.out.println("Multiplication  : " + (a * b));
                break;

            case '/':
                if(b==0)
                    System.out.println("Cannot divide by zero");
                else
                    System.out.println("division "+a+" / "+b+"  : " + (a / b));

                if (a == 0)
                    System.out.println("Cannot divide by zero");
                else
                    System.out.println("division " + b + " / " + a + "  : " + (b /a));

                break;
            
            default:
                System.out.println("Enter either: +, -, *, /");
        }


        ob.close();
    }
}
