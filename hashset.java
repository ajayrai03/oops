import java.util.HashSet;
import java.util.Iterator;

public class hashset {
	public static void main(String[] args) {
		
		HashSet<Integer> hashbrowns = new HashSet<>();
		hashbrowns.add(13);
		hashbrowns.add(24);
		hashbrowns.add(5);
		
		Iterator<Integer> it = hashbrowns.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		

}
System.out.println(hashbrowns);
}
}
