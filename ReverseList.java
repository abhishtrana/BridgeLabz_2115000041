import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class ReverseList{
	public static void reverse(List<Integer> list){
		int left=0;
		int right=list.size()-1;
		while(left<right){
			int temp=list.get(left);
			list.set(left,list.get(right));
			list.set(right,temp);
			left++;
			right--;
		}
	}
	public static void main(String args[]){
		ArrayList<Integer> arraylist=new ArrayList<>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		System.out.println("Original ArrayList"+arraylist);
		reverse(arraylist);
		System.out.println("Reversed Arraylist"+arraylist);
		LinkedList<Integer> Linkedlist=new LinkedList<>(arraylist);
		 System.out.println("\nOriginal LinkedList: " + Linkedlist);
        reverse(Linkedlist);
        System.out.println("Reversed LinkedList: " + Linkedlist);
    }
}