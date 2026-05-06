import java.util.Scanner;
public class middlenum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-digit number");
        int n = sc.nextInt();
        int middle=(n/10)%10;
        if(middle%3 == 0){
            System.out.println("divisible by 3");
        }
        else{
            
            System.out.println("not divisible by 3");
            
        }

    }
    
}
