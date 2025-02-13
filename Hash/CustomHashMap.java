import java.util.LinkedList;

class CustomHashMap {
    
    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;
    
    private LinkedList<Entry>[] buckets;
    private int size;

    private static class Entry {
        final String key;
        String value;
        
        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    
    public CustomHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        size = 0;
        
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    private int getBucketIndex(String key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }
    
    public void put(String key, String value) {
        int index = getBucketIndex(key);
        LinkedList<Entry> bucket = buckets[index];
        
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        
        bucket.add(new Entry(key, value));
        size++;
        
        if (size > buckets.length * LOAD_FACTOR) {
            resize();
        }
    }
    
    public String get(String key) {
        int index = getBucketIndex(key);
        LinkedList<Entry> bucket = buckets[index];
        
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        
        return null;
    }
    
    public void remove(String key) {
        int index = getBucketIndex(key);
        LinkedList<Entry> bucket = buckets[index];
        
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }
    
    private void resize() {
        LinkedList<Entry>[] oldBuckets = buckets;
        buckets = new LinkedList[buckets.length * 2];
        size = 0;
        
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
        
        for (LinkedList<Entry> bucket : oldBuckets) {
            for (Entry entry : bucket) {
                put(entry.key, entry.value);
            }
        }
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        
        map.put("apple", "fruit");
        map.put("carrot", "vegetable");
        map.put("banana", "fruit");
        
        System.out.println(map.get("apple"));
        System.out.println(map.get("carrot"));
        System.out.println(map.get("banana"));
        
        map.remove("banana");
        System.out.println(map.get("banana"));
        
        System.out.println("Size: " + map.size());
        System.out.println("Is empty? " + map.isEmpty());
    }
}

