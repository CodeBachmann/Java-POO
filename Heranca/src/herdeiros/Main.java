package herdeiros;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		
	Map<Integer, String> map = new HashMap<>();
    
    map.put(1, "One");
    map.put(2, "Two");
    map.put(3, "Three");

    System.out.println(map); // Output: {1=One, 2=Two, 3=Three}
		
	Pessoa gustavo = new Pessoa(1.80f ,"Gustavo", 23);
	System.out.println(gustavo.getAge());
	gustavo.envelhecer(gustavo, 10);
	System.out.println(gustavo.getAge());


	}
}
