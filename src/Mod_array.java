import java.util.Scanner;
public class Mod_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the array size");
        int n= sc.nextInt();
        int num=0,z=1;
        int [] a = new int[n];
        System.out.println("enter array elements");
        if (n > 0) {
        for (int i=0; i<n;i++){
            a[i]=sc.nextInt();
            }
            System.out.println("Enter a number");

        int b= sc.nextInt();
        for (int j=n-1;j>=0;j--){
            num=num+((a[j]%b)*z)%b;
            z=(z*10)%b;
        }
        System.out.println(num%b);
        }
        else
            System.out.println("Enter a valid array size");
    }
}
