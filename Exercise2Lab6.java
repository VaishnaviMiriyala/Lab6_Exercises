package m9.task3;
import java.util.*;
public class Exercise2Lab6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		Map<Character,Integer> hashmap = new Exercise2Lab6().countChar(arr);
		System.out.println(hashmap);
	}
    public Map<Character,Integer> countChar(char[] array){
    	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
    	for(int i = 0;i < array.length;i++) {
    		int count = 0;
    		for(int j = 0;j < array.length;j++) {
    			if(array[i] == array[j]) {
    				count++;
    			}
    		}
    		hm.put(array[i], count);
    	}
    	return hm;
    }
}
