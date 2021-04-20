package m9.task3;
import java.util.*;
public class Exercise7Lab6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = Integer.parseInt(sc.nextLine());
		int arr[] = new int[num];
		for(int i = 0;i < num;i++) {
			arr[i] = sc.nextInt();
		}
        List<Integer> list = new Exercise7Lab6().getSorted(arr);
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
        	Integer i = itr.next();
        	System.out.print(i+" ");
        }
	}
    public List<Integer> getSorted(int array[]) {
    	List<Integer> l = new ArrayList<>();
       for(int i = 0;i < array.length;i++) {
    	   StringBuffer str = new StringBuffer();
    	    String s = str.append(array[i]).reverse().toString();
    	     l.add(Integer.parseInt(s));
       }
       Collections.sort(l);
       return l;
    }
}
