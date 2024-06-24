import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int fact=1;
        //range (num ,2)
        for(int i= num; i>1;i--){
            fact *=i;
        }
        System.out.println("Factorial of " +num + " :" + fact);
        sc.close();
    }
    
}
