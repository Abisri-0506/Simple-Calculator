import java.util.Scanner;
public class hello{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Simple calculator");
    System.out.println("enter first number");
    float a=sc.nextFloat();
    System.out.println("enter second number");
    float b=sc.nextFloat();
    System.out.println("1.addition");
    System.out.println("2.subtraction");
    System.out.println("3.multiplication");
    System.out.println("4.division");
    System.out.println("enter your choice(1-4)");
    int choice=sc.nextInt();
    switch(choice){
        case 1:
            float add=a+b;
            System.out.println("addition:"+add);
            break;
        case 2:
            float sub=a-b;
            System.out.println("subtraction:"+sub);
            break;
        case 3:
            float mul=a*b;
            System.out.println("multiplication:"+mul);
            break;
        case 4:
            float div=a/b;
            System.out.println("division:"+div);
            break;
    
    }
}
}





