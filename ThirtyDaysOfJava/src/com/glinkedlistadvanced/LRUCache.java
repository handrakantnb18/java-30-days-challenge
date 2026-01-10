import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {
    private final int capacity;
    private final Map<K, V> cache;

    public LRUCache(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        this.capacity = capacity;

        this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public synchronized V get(K key) {
        return cache.getOrDefault(key, null);
    }

    public synchronized void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
        cache.put(key, value);
    }

    public synchronized void displayCache() {
        System.out.println(cache);
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> lru = new LRUCache<>(3);

        lru.put(1, "One");
        lru.put(2, "Two");
        lru.put(3, "Three");
        lru.displayCache();

        lru.get(1);
        lru.put(4, "Four");
        lru.displayCache();

        lru.put(5, "Five");
        lru.displayCache();
    }
}