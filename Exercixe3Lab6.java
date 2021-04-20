package m9.task3;
import java.util.*;
public class Exercixe3Lab6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = Integer.parseInt(sc.nextLine());
		int arr[] = new int[num];
		for(int i = 0;i < num;i++) {
			arr[i] = sc.nextInt();
		}
		HashMap<Integer,Integer> hm = new Exercixe3Lab6().getSquares(arr);
		System.out.println(hm);
	}
	public HashMap<Integer,Integer> getSquares(int array[]){
		HashMap<Integer,Integer> hashmap = new  HashMap<>();
		for(int i = 0;i < array.length;i++) {
			hashmap.put(array[i], (array[i]*array[i]));
		}
		return hashmap;
	}

}
