import java.util.Scanner;
class Swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping");
        System.out.println("a=" +a+"b="+b);
        sc.close();

    }
}