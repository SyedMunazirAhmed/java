import java.util.Scanner;

public class Missing {
    public static void main(String args[]){
        int n=99,sum=0;
        int flag = 101*50;
        System.out.print("Enter array Elements: ");
        int arr[] = new int[n];
        Scanner sc =  new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            sum+=arr[i];
        }
        int num = flag - sum;
        System.out.println("The Missing number is "+num+" .");
        sc.close();
    }
}