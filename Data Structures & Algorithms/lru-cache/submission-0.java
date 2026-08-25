class LRUCache {

    int cap;
    Node left;
    Node right;
    Map<Integer, Node> cache;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public void remove(Node node) {
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }

    public void insert(Node node) {
        Node n = this.right.prev;
        n.next = node;
        node.prev = n;
        node.next = this.right;
        this.right.prev = node;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)) {
            Node ptr = cache.get(key);
            remove(ptr);
            insert(ptr);
            return ptr.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            remove(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);

        if(cache.size() > cap) {
           Node lru = this.left.next;
           remove(lru);
           cache.remove(lru.key); 
        }
    }
}

public class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
