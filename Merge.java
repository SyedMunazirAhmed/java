import java.util.*;
import java.util.Scanner;
public class Merge{

    public static void quickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    public static int partition(List<Integer> list, int low, int high) {
        int pivotValue = list.get(high);
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (list.get(j) < pivotValue) {
                i++;
                // swap elements at index i and j
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        // swap elements at index i+1 and high (pivot)
        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }

    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        // Collections.sort(mergedList); //Using built-in Function

        //Using quick sort
        int n = mergedList.size();
        quickSort(mergedList, 0, n - 1);
        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int n,x;
        System.out.print("Enter size of first list:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Enter elements of first list:");
        for(int i=0;i<n;i++){
            x = sc.nextInt();
            list1.add(x);
        }
        System.out.print("Enter size of second list:");
        n = sc.nextInt();
        System.out.print("Enter elements of second list:");
        for(int i=0;i<n;i++){
            x = sc.nextInt();
            list2.add(x);
        }
        List<Integer> mergedList = merge(list1,list2);
         System.out.println(mergedList); 
         sc.close();
    }
}
