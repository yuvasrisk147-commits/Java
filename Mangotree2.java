import java.util.Scanner;
public class Mangotree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        if(n<=c||n%c==1||n%c==0){
            System.out.println("MangoTree");
        }
        else{
            System.out.println("Not a MangoTree");
        }
    }
}
