package m9.task3;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
public class Exercise6Lab6 {

	public static void main(String[] args) {
		Map<Integer,LocalDate> map = new HashMap<>();
		map.put(101, LocalDate.of(1999, 9, 03));
		map.put(102, LocalDate.of(2000, 7, 05));
		map.put(103, LocalDate.of(2011, 1, 15));
		map.put(104, LocalDate.of(1975, 12, 31));
		map.put(105, LocalDate.of(2009, 9, 30));
		List<Integer> list = new Exercise6Lab6().getVotersList(map);
	    Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
        	Integer i = itr.next();
        	System.out.print(i+" ");
        }
	}
	public List<Integer> getVotersList(Map<Integer,LocalDate> hm){
		Iterator<Integer> itr = hm.keySet().iterator();
		
		List<Integer> l = new ArrayList<>();
		while(itr.hasNext()) {
			Integer i = itr.next();
			if((LocalDate.now().getYear() -hm.get(i).getYear())  >= 18) {
				l.add(i);
			}
		}
		return l;
	}

}
