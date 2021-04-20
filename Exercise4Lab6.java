package m9.task3;
import java.util.*;
public class Exercise4Lab6 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hashmap = new HashMap<>();
		hashmap.put(111, 70);
		hashmap.put(222, 80);
		hashmap.put(333, 50);
		hashmap.put(444, 90);
		hashmap.put(555, 60);
		HashMap<Integer,String> hm =  new Exercise4Lab6().getStudents(hashmap);
		System.out.println(hm);
	}
    public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hm){
    	HashMap<Integer,String> hm1 = new HashMap<>();
    	Iterator<Integer> itr = hm.keySet().iterator();
    	while(itr.hasNext()) {
    		Integer i = itr.next();
    		
    		if(hm.get(i) >= 90) {
    			hm1.put(i, "Gold");
    		}else if(hm.get(i) >= 80 && hm.get(i) < 90) {
    			hm1.put(i, "Silver");
    		}else if(hm.get(i) >= 70 && hm.get(i) < 80){
    			hm1.put(i, "Bronze");
    		}else {
    			hm1.put(i,null);
    		}
    	}
    	return hm1;
    }
}
