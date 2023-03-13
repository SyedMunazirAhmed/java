import java.util.*;
import java.util.Scanner;
public class Merge{
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList);

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int n,x;
        System.out.println("Enter size of first list:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter elements of first list:");
        for(int i=0;i<n;i++){
            x = sc.nextInt();
            list1.add(x);
        }
        System.out.println("Enter size of second list:");
        n = sc.nextInt();
        System.out.println("Enter elements of second list:");
        for(int i=0;i<n;i++){
            x = sc.nextInt();
            list2.add(x);
        }
        List<Integer> mergedList = merge(list1,list2);
         System.out.println(mergedList); 
         sc.close();
    }
}
