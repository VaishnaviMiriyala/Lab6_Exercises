package m9.task3;
import java.util.*;
public class Exercise5Lab6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = Integer.parseInt(sc.nextLine());
		int arr[] = new int[num];
		for(int i = 0;i < num;i++) {
			arr[i] = sc.nextInt();
		}
		int res = new Exercise5Lab6().getSecondSmallest(arr);
		System.out.println("The second smallest element is: "+res);
	}
    public int getSecondSmallest(int array[]) {
    	List<Integer> l = new ArrayList<>();
    	for(int i = 0;i < array.length;i++) {
    		l.add(array[i]);
    	}
    	Collections.sort(l);
    	return l.get(1);
    }
}
