package hashmap;

public class CustomHashMap<K, V> {
    private static final int  INITIAL_SIZE = 1<<4; //16
    private static final int MAXIMUM_CAPACITY = 1 << 30;


    Node[] hashMap;

    CustomHashMap() {
        this.hashMap = new Node[5];
    }
    class Node<K, V> {
        K key;
        V value;
        Node next;

        Node(K k, V v) {
            this.key = k;
            this.value = v;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public void put(K key, V value) {
        int hashcode = key.hashCode() % hashMap.length;
        Node node = hashMap[hashcode];
        Node newNode = new Node(key, value);
        if (node == null) {
            hashMap[hashcode] = newNode;
        }
        else {
            Node prevNode = node;
            while (node != null) {
                if(node.key == key) {
                    node.value = value;
                    return;
                }
                prevNode = node;
                node = node.next;
            }
            prevNode.next = newNode;
        }
    }

    public V get(K key) {
        int hashcode = key.hashCode() % hashMap.length;
        Node node = hashMap[hashcode];
        while (node != null) {
            if (node.key == key)
                return (V)node.value;
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();
        map.put(1, "hi");
        map.put(2, "my");
        map.put(3, "name");
        map.put(4, "is");
        map.put(5, "Harsh");
        map.put(6, "how");
        map.put(7, "are");
        map.put(8, "you");
        map.put(9, "friends");
        map.put(10, "?");

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
        System.out.println(map.get(5));
        System.out.println(map.get(6));
        System.out.println(map.get(7));
        System.out.println(map.get(8));
        System.out.println(map.get(9));
        System.out.println(map.get(10));
    }
}
