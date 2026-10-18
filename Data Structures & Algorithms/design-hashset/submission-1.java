class MyHashSet {
    private LinkedList<Integer>[] buckets;
    private int size = 1000;

    public MyHashSet() {
        buckets = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    public void add(int key) {
        int index = hash(key);
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }
    private int hash(int key) {
        return key % size;
    }
    
    public void remove(int key) {
        int index = hash(key);
        buckets[index].remove((Integer) key);
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        return buckets[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */