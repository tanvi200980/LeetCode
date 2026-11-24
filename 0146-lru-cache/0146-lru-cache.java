class LRUCache {

class Node {
    int key, value;
    Node prev, next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

HashMap<Integer, Node> map = new HashMap<>();
Node head = new Node(-1, -1);
Node tail = new Node(-1, -1);
int capacity;

public LRUCache(int capacity) {
    this.capacity = capacity;
    head.next = tail;
    tail.prev = head;
}

public void delete(Node node) {
    node.prev.next = node.next;
    node.next.prev = node.prev;
}

public void insert(Node node) {
    node.next = head.next;
    node.prev = head;
    head.next.prev = node;
    head.next = node;
}

public int get(int key) {
    if(!map.containsKey(key)) {
        return -1;
    }

    Node node = map.get(key);
    delete(node);
    insert(node);

    return node.value;
}

public void put(int key, int value) {
    if(map.containsKey(key)) {
        Node node = map.get(key);
        delete(node);
        node.value = value;
        insert(node);
    }
    else {
        if(map.size() == capacity) {
            Node lru = tail.prev;
            delete(lru);
            map.remove(lru.key);
        }

        Node node = new Node(key, value);
        insert(node);
        map.put(key, node);
    }
}
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */