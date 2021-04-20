package m9.task3;
import java.util.*;
public class Exercixe1Lab6 {
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("Java", 1);
		hm.put("Python", 2);
		hm.put("Electrical", 3);
		hm.put("Electronics", 4);
		hm.put("Civils", 5);
		List<Integer> list = new Exercixe1Lab6().getValues(hm);
		
	   for(int i : list) {
		   System.out.print(i+" ");
	   }
	}
	public List<Integer> getValues(HashMap<String,Integer> hashmap){
		Iterator<String> itr = hashmap.keySet().iterator();
		List<Integer> l = new ArrayList<Integer>();
		while(itr.hasNext()) {
			String subject = itr.next();
			l.add(hashmap.get(subject));
		}
		Collections.sort(l);
		return l;
		
	}
    
}
