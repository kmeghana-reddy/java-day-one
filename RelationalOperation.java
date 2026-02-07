import java.util.Scanner;
class RelationalOperation{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        byte age=sc.nextByte();
        if(age>0){
            System.out.println("you'll be "+(age+20)+" years old 20 years later");
        }
        else if(age==0){
            System.out.println("you are yet to be born!!");
        }
        else{
            System.out.println("Invalid age!!");
        }
    }
}         
    

    
        

    
