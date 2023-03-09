import java.util.LinkedList;
import java.util.Scanner;
public class Zeroes{
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
        for (int i = llist.size() - 1; i >= 0; i--) {
 
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
  public static void main(String[] args) {
    LinkedList<Integer> num = new LinkedList<Integer>();
    Scanner sc =  new Scanner(System.in);
    int n,count=0;
    n = sc.nextInt();
    while(n>0){
        int temp = n%10;
        if(temp==0){
            count++;
        }
        else{
            num.add(temp);
        }
        n=n/10;
    }
    num = reverseLinkedList(num);
    for(int i=0;i<count;i++)
    {
        num.add(0);
    }

    System.out.println(num);
    sc.close();
  }
}
