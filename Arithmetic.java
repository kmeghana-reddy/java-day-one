import java.util.Scanner;
class Arithmetic{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition operation"+(a+b));
        System.out.println("Subtraction operation"+(a-b));
        System.out.println("Multiplication operation"+(a*b));
        System.out.println("Integer division operation"+(a/b));
        System.out.println("Modulo operation"+(a%b));
    }  
}      
        

        
    
