import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
    public static int[] removeDuplicates(int[] arr) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArr[i++] = num;
        }
        
        return uniqueArr;
    }
    
    public static void main(String[] args) {
        int n;
        System.out.print("Enter size of array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArr)); 
        sc.close();
    }
}
