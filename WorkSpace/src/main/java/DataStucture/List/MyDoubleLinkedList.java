package DataStucture.List;

public class MyDoubleLinkedList<T> implements MyList<T>{

    private int size = 0;
    private Node head;
    private Node tail;

    public MyDoubleLinkedList() {
        this.size = 0;
        this.head = new Node(null);
        this.tail = new Node(null);
        this.head.next = this.tail;
        this.tail.pre = this.head;
    }

    @Override
    public void add(T t) {
        Node last = this.tail.pre;
        Node node = new Node(t, last, this.tail);
        last.next = node;
        this.tail.pre = node;
        this.size++;
    }

    @Override
    public void insert(int index, T t) {

    }

    @Override
    public void clear() {
        this.size = 0;
        this.head.next = this.tail;
        this.tail.pre = this.head;
    }

    @Override
    public boolean delete(T t) {
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        private T data;
        private Node pre;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node pre, Node next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }

    }
}
