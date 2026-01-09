import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU Cache implementation using LinkedHashMap.
 * Maintains insertion order but reorders on access to track usage.
 */
public class LRUCache<K, V> {
    private final int capacity;
    private final Map<K, V> cache;

    public LRUCache(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        this.capacity = capacity;

        // accessOrder = true → orders entries by access (get/put)
        this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    /**
     * Retrieves a value from the cache.
     * @param key The key to look up.
     * @return The value if present, otherwise null.
     */
    public synchronized V get(K key) {
        return cache.getOrDefault(key, null);
    }

    /**
     * Inserts or updates a value in the cache.
     * @param key The key to insert/update.
     * @param value The value to store.
     */
    public synchronized void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
        cache.put(key, value);
    }

    /**
     * Displays the current cache state (for debugging).
     */
    public synchronized void displayCache() {
        System.out.println(cache);
    }

    // Test the LRU Cache
    public static void main(String[] args) {
        LRUCache<Integer, String> lru = new LRUCache<>(3);

        lru.put(1, "One");
        lru.put(2, "Two");
        lru.put(3, "Three");
        lru.displayCache(); // {1=One, 2=Two, 3=Three}

        lru.get(1); // Access key 1 → moves it to most recently used
        lru.put(4, "Four"); // Removes least recently used (key 2)
        lru.displayCache(); // {3=Three, 1=One, 4=Four}

        lru.put(5, "Five"); // Removes least recently used (key 3)
        lru.displayCache(); // {1=One, 4=Four, 5=Five}
    }
}