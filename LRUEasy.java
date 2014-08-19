package LRU;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

public class LRUEasy<K,V> extends LinkedHashMap<K,V> {
	
	private int capacity = 0;
	
	public LRUEasy(int capacity)
	{
		super(capacity + 1, .75f, true); //true for access order
		this.capacity = capacity;
	}
	
	protected boolean removeEldestEntry(Entry e)
	{
		return (size() > this.capacity);
	}

}

    

